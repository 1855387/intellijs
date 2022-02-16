package com.nighthawk.intellijs.music;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Spotify {
    public void Spotify_data() throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://spotify23.p.rapidapi.com/playlist_tracks/?id=3HcUSkKMkjylvik427meqX&offset=0&limit=100"))
                .header("x-rapidapi-host", "spotify23.p.rapidapi.com")
                .header("x-rapidapi-key", "bcdf06c872mshbd25dcebbd373b9p1afb3ajsncedd5c4986ed")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;
        JSONArray song = (JSONArray) jo.get("items");
        System.out.println(song);


    }

 public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        Spotify test = new Spotify();
        test.Spotify_data();
 }





}
