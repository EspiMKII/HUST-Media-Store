package media;

import java.util.Map;
import java.util.HashMap;

public class CD extends Media {
    private Map<String, Long> trackList = new HashMap<>();

    public Map<String, Long> getTrackList() {
        return trackList;
    }

    public void addTrack(String title, long duration) {
        if (!trackList.containsKey(title)) {
            trackList.put(title, duration);
        } else {
            // implement something
        }
    }

    public void removeTrack(String title) {
        if (trackList.containsKey(title)) {
            trackList.remove(title);
        } else {
            // implement something
        }
    }

    public void editTrackName(String oldTitle, String newTitle) {
        try {
            long duration = trackList.get(oldTitle);
            trackList.remove(oldTitle);
            trackList.put(newTitle, duration);
        } catch (NullPointerException e) {
            // implement something            
        }
    }

    public void editTrackDuration(String title, long newDuration) {
        try {
            trackList.put(title, newDuration);
        } catch (NullPointerException e) {
            // implement something
        }
    }

    public long getDuration() {
        long totalDuration = 0;
        for (long duration : trackList.values()) {
            totalDuration += duration;
        }
        return totalDuration;
    }
}
