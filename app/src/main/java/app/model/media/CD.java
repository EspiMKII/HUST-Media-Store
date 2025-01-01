package app.model.media;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CD extends Media {
    private Map<String, Long> tracks;

    public Map<String, Long> getTracks() {
        return tracks;
    }
    public void addTrack(String title, long duration) {
        if (!tracks.containsKey(title)) {
            tracks.put(title, duration);
        } else {
            //implement logic here
        }
    }
    public void removeTrack(String title) {
        if (tracks.containsKey(title)) {
            tracks.remove(title);
        } else {
            //implement logic here
        }
    }
    public void editTrackTitle(String oldTitle, String newTitle) {
        if (tracks.containsKey(oldTitle)) {
            long duration = tracks.get(oldTitle);
            tracks.remove(oldTitle);
            tracks.put(newTitle, duration);
        } else {
            //implement logic here
        }
    }
    public void editTrackLength(String title, long newDuration) {
        if (tracks.containsKey(title)) {
            tracks.put(title, newDuration);
        } else {
            //implement logic here
        }
    }

    public CD(String title, ArrayList<String> creators, Date releaseDate, ArrayList<String> genres, String language,
              float price, Map<String, Long> tracks) {
        super(title, creators, releaseDate, genres, language, price);
        this.tracks = new HashMap<>(tracks);
    }
}
