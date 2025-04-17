import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';
import 'package:url_launcher/url_launcher.dart';
import '../spotify_credentials.dart';  // ✅ Import credentials

class MusicScreen extends StatefulWidget {
  const MusicScreen({super.key});

  @override
  _MusicScreenState createState() => _MusicScreenState();
}

class _MusicScreenState extends State<MusicScreen> {
  List<dynamic> songs = [];
  bool isLoading = true;

  final String clientId = SpotifyCredentials.clientId;  // ✅ Secure API Key Usage
  final String clientSecret = SpotifyCredentials.clientSecret;

  @override
  void didChangeDependencies() {
    super.didChangeDependencies();
    final String mood = ModalRoute.of(context)!.settings.arguments as String;
    fetchSongs(mood);
  }

  // ✅ Get Spotify Token
  Future<String> getSpotifyToken() async {
    final response = await http.post(
      Uri.parse('https://accounts.spotify.com/api/token'),
      headers: {
        'Authorization': 'Basic ${base64Encode(utf8.encode('$clientId:$clientSecret'))}',
        'Content-Type': 'application/x-www-form-urlencoded',
      },
      body: {'grant_type': 'client_credentials'},
    );

    print("🔍 Spotify Token Response: ${response.statusCode}");

    if (response.statusCode == 200) {
      final data = json.decode(response.body);
      print("✅ Spotify Token: ${data['access_token']}");
      return data['access_token'];
    } else {
      print("❌ Failed to get Spotify Token. Response: ${response.body}");
      throw Exception('Failed to get Spotify Token');
    }
  }

  // ✅ Fetch Songs from Spotify API
  Future<void> fetchSongs(String mood) async {
    setState(() {
      isLoading = true;
    });

    final token = await getSpotifyToken();
    print("🔍 Fetching songs for mood: $mood");

    final url = 'https://api.spotify.com/v1/search?q=$mood&type=track&limit=10';
    final response = await http.get(
      Uri.parse(url),
      headers: {'Authorization': 'Bearer $token'},
    );

    print("🔄 API Response: ${response.statusCode}");
    print("🔄 Response Body: ${response.body}");

    if (response.statusCode == 200) {
      final data = json.decode(response.body);
      
      setState(() {
        songs = data['tracks']['items'];
        isLoading = false;
      });

      print("✅ Fetched ${songs.length} songs for $mood");
    } else {
      setState(() {
        isLoading = false;
      });

      print("❌ Failed to fetch songs. Error: ${response.body}");
    }
  }

  // ✅ Open Spotify URL Correctly
  void _launchSpotify(String url) async {
    Uri uri = Uri.parse(url);
    if (await canLaunchUrl(uri)) {
      await launchUrl(uri, mode: LaunchMode.externalApplication);
    } else {
      print("❌ Could not open Spotify URL");
      ScaffoldMessenger.of(context).showSnackBar(
        const SnackBar(content: Text("Could not open Spotify. Please try again.")),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    final String mood = ModalRoute.of(context)!.settings.arguments as String;

    return Scaffold(
      appBar: AppBar(title: Text('Songs for $mood 🎵')),
      body: isLoading
          ? const Center(child: CircularProgressIndicator())
          : songs.isEmpty
              ? const Center(child: Text('No songs found'))
              : ListView.builder(
                  itemCount: songs.length,
                  itemBuilder: (context, index) {
                    final song = songs[index];

                    // ✅ Check if song has an image
                    String imageUrl = song['album']['images'] != null &&
                            song['album']['images'].isNotEmpty
                        ? song['album']['images'][0]['url']
                        : '';

                    // ✅ Check if song has a Spotify link
                    bool hasSpotifyUrl = song.containsKey('external_urls') &&
                        song['external_urls'].containsKey('spotify');

                    return ListTile(
                      leading: imageUrl.isNotEmpty
                          ? Image.network(imageUrl)  // ✅ Show image if available
                          : const Icon(Icons.music_note, size: 40),  // ✅ Default icon if no image

                      title: Text(song['name']),  // ✅ Show song title
                      subtitle: Text(song['artists'][0]['name']),  // ✅ Show artist name

                      onTap: () {
                        if (hasSpotifyUrl) {
                          _launchSpotify(song['external_urls']['spotify']);
                        } else {
                          ScaffoldMessenger.of(context).showSnackBar(
                            const SnackBar(content: Text("No Spotify link available for this song")),
                          );
                        }
                      },
                    );
                  },
                ),
    );
  }
}
