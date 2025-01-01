package app.model.media;

public class Track {
    private String title;
    private int duration;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Track(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
