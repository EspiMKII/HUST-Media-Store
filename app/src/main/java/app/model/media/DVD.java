package app.model.media;

import java.util.ArrayList;
import java.util.Date;

public class DVD extends Media {
    private int duration;

    public long getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public DVD(String title, ArrayList<String> creators, int releaseYear, ArrayList<String> genres, String language,
               float price, int duration) {
        super(title, creators, releaseYear, genres, language, price);
        this.duration = duration;
    }
}
