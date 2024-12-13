import 'package:flutter/material.dart';
import 'package:grpc/grpc.dart';
import 'compte.pbgrpc.dart';
import 'package:intl/intl.dart';

class CompteListScreen extends StatefulWidget {
  @override
  _CompteListScreenState createState() => _CompteListScreenState();
}

class _CompteListScreenState extends State<CompteListScreen> {
  List<Compte> _comptes = [];
  bool _isLoading = true;
  String? _errorMessage;

  late CompteServiceClient _client;
  late ClientChannel _channel;

  @override
  void initState() {
    super.initState();
    _initializeGrpcClient();
  }

  @override
  void dispose() {
    // Properly close the gRPC channel
    _channel.shutdown();
    super.dispose();
  }

  void _initializeGrpcClient() {
    _channel = ClientChannel(
      '10.0.2.2',
      port: 9090,
      options: const ChannelOptions(
        credentials: ChannelCredentials.insecure(),
      ),
    );

    _client = CompteServiceClient(_channel);
    _fetchComptes();
  }

  void _fetchComptes() async {
    try {
      final request = GetAllComptesRequest();
      final response = await _client.allComptes(request);
      
      setState(() {
        _comptes = response.comptes;
        _isLoading = false;
      });
    } catch (e) {
      setState(() {
        _errorMessage = 'Failed to load comptes: $e';
        _isLoading = false;
      });
    }
  }

  void _deleteCompte(String id) async {
    try {
      final request = DeleteCompteRequest()..id = id;
      await _client.deleteCompte(request);
      
      // Refresh the list after deletion
      _fetchComptes();
    } catch (e) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text('Failed to delete compte: $e')),
      );
    }
  }

  void _showAddCompteDialog() {
    final soldeController = TextEditingController();
    final dateController = TextEditingController();
    TypeCompte? selectedType;

    showDialog(
      context: context,
      builder: (context) => StatefulBuilder(
        builder: (context, setState) => AlertDialog(
          title: Text('Add New Compte'),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              TextField(
                controller: soldeController,
                decoration: InputDecoration(labelText: 'Solde'),
                keyboardType: TextInputType.number,
              ),
              TextField(
                controller: dateController,
                decoration: InputDecoration(labelText: 'Date Creation'),
                onTap: () async {
                  DateTime? pickedDate = await showDatePicker(
                    context: context,
                    initialDate: DateTime.now(),
                    firstDate: DateTime(2000),
                    lastDate: DateTime(2101),
                  );
                  
                  if (pickedDate != null) {
                    dateController.text = 
                      DateFormat('yyyy-MM-dd').format(pickedDate);
                  }
                },
              ),
              DropdownButton<TypeCompte>(
                hint: Text('Select Compte Type'),
                value: selectedType,
                onChanged: (TypeCompte? newValue) {
                  setState(() {
                    selectedType = newValue;
                  });
                },
                items: TypeCompte.values
                    .map<DropdownMenuItem<TypeCompte>>((TypeCompte value) {
                  return DropdownMenuItem<TypeCompte>(
                    value: value,
                    child: Text(value.toString().split('.').last),
                  );
                }).toList(),
              ),
            ],
          ),
          actions: [
            TextButton(
              onPressed: () => Navigator.of(context).pop(),
              child: Text('Cancel'),
            ),
            ElevatedButton(
              onPressed: () {
                if (soldeController.text.isNotEmpty && 
                    dateController.text.isNotEmpty && 
                    selectedType != null) {
                  final newCompte = Compte()
                    ..solde = double.parse(soldeController.text)
                    ..dateCreation = dateController.text
                    ..type = selectedType!;

                  _saveCompte(newCompte);
                  Navigator.of(context).pop();
                }
              },
              child: Text('Save'),
            ),
          ],
        ),
      ),
    );
  }

  void _saveCompte(Compte compte) async {
  try {
    final request = SaveCompteRequest()
      ..compte = CompteRequest(
        solde: compte.solde,
        dateCreation: compte.dateCreation,
        type: compte.type,
      );
    await _client.saveCompte(request);
    _fetchComptes();
  } catch (e) {
    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(content: Text('Failed to save compte: $e')),
    );
  }
}

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Comptes Management'),
        actions: [
          IconButton(
            icon: Icon(Icons.add),
            onPressed: _showAddCompteDialog,
          ),
        ],
      ),
      body: _isLoading
          ? Center(child: CircularProgressIndicator())
          : _errorMessage != null
              ? Center(child: Text(_errorMessage!))
              : ListView.builder(
                  itemCount: _comptes.length,
                  itemBuilder: (context, index) {
                    final compte = _comptes[index];
                    return ListTile(
                      title: Text('Compte ID: ${compte.id}'),
                      subtitle: Text(
                        'Solde: ${compte.solde}\n'
                        'Type: ${compte.type}\n'
                        'Date: ${compte.dateCreation}',
                      ),
                      trailing: IconButton(
                        icon: Icon(Icons.delete, color: Colors.red),
                        onPressed: () => _deleteCompte(compte.id as String),
                      ),
                    );
                  },
                ),
    );
  }
}