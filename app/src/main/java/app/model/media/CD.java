package app.model.media;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CD extends Media {
    private ArrayList<Track> tracks;

    public ArrayList<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track does not exist");
        }

    }

    public int getTracksAmount() {
        return tracks.size();
    }

    public CD(String title, ArrayList<String> creators, int releaseYear, ArrayList<String> genres, String language, float price, ArrayList<Track> tracks) {
        super(title, creators, releaseYear, genres, language, price);
        this.tracks = tracks;
    }
}


