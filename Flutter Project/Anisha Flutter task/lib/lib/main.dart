import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/material.dart';
import 'package:moodtunes/screens/home_screen.dart';
import 'package:moodtunes/screens/mood_screen.dart';
import 'package:moodtunes/screens/music_screen.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(); // Initialize Firebase
  runApp(const MoodTunesApp());
}

class MoodTunesApp extends StatelessWidget {
  const MoodTunesApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'MoodTunes',
      theme: ThemeData.dark(), // Dark theme for a cool look
      initialRoute: '/', // Start at HomeScreen
      routes: {
        '/': (context) => const HomeScreen(),
        '/mood': (context) => const MoodScreen(),
        '/music': (context) => const MusicScreen(),
      },
    );
  }
}
