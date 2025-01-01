package app.model.media;

import java.util.ArrayList;
import java.util.Date;

public class DVD extends Media {
    private long duration;

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public DVD(String title, ArrayList<String> creators, Date releaseDate, ArrayList<String> genres, String language,
               float price, long duration) {
        super(title, creators, releaseDate, genres, language, price);
        this.duration = duration;
    }
}
