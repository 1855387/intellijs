package com.nighthawk.intellijs.music;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Random;

public class Spotify {
    public JSONObject Spotify_data() throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://spotify23.p.rapidapi.com/playlist_tracks/?id=3HcUSkKMkjylvik427meqX&offset=0&limit=100"))
                .header("x-rapidapi-host", "spotify23.p.rapidapi.com")
                .header("x-rapidapi-key", "bcdf06c872mshbd25dcebbd373b9p1afb3ajsncedd5c4986ed")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        Object obj = new JSONParser().parse(response.body());
        JSONObject jo = (JSONObject) obj;
        JSONArray songs = (JSONArray) jo.get("items");





        JSONObject song = (JSONObject) songs.get((int) Math.random() * 79);

        return (JSONObject) song.get("track");


    }

    @GetMapping("/music")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String music(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) throws IOException, ParseException, InterruptedException {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html

        Spotify test = new Spotify();
        JSONObject output = test.Spotify_data();

        String song = (String) output.get("name");
        String song_link = (String) (((JSONObject) output.get("external_urls")).get("spotify"));
        String artist = "test_artist";

        model.addAttribute("song", song);
        model.addAttribute("song_link", song_link);
        model.addAttribute("artist", artist);

        return "music"; // returns HTML VIEW (greeting)
    }

 public static void main(String[] args) throws IOException, InterruptedException, ParseException {
        Spotify test = new Spotify();
        JSONObject output = test.Spotify_data();
        System.out.println(output.get("name"));
 }





}
