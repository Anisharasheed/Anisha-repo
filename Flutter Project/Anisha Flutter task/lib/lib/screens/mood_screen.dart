import 'package:flutter/material.dart';

class MoodScreen extends StatelessWidget {
  const MoodScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Select Your Mood 😃')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text('How are you feeling today?', style: TextStyle(fontSize: 18)),
            const SizedBox(height: 20),
            Wrap(
              spacing: 10,
              children: [
                _moodButton(context, 'Happy', Colors.yellow),
                _moodButton(context, 'Sad', Colors.blue),
                _moodButton(context, 'Relaxed', Colors.green),
                _moodButton(context, 'Energetic', Colors.orange),
              ],
            ),
          ],
        ),
      ),
    );
  }

  Widget _moodButton(BuildContext context, String mood, Color color) {
    return ElevatedButton(
      style: ElevatedButton.styleFrom(backgroundColor: color),
      onPressed: () {
        Navigator.pushNamed(context, '/music', arguments: mood); // Go to Music Screen
      },
      child: Text(mood, style: const TextStyle(color: Colors.white)),
    );
  }
}
