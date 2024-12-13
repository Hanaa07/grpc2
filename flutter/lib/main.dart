import 'package:flutter/material.dart';

import 'compte_list_screen.dart';

void main() {
  runApp(const MyGrpcApp());
}

class MyGrpcApp extends StatelessWidget {
  const MyGrpcApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Compte Management',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: CompteListScreen(),
    );
  }
}