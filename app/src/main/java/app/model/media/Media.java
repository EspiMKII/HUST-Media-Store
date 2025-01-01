package app.model.media;

import java.util.ArrayList;
import java.util.Date;

public class Media {
    private int id;
    private String title;
    private ArrayList<String> creators;
    private Date releaseDate;
    private ArrayList<String> genres;
    private String language;
    private float price;

    public Media(String title, ArrayList<String> creators, Date releaseDate, ArrayList<String> genres,
            String language, float price) {
        this.title = title;
        this.creators = creators;
        this.releaseDate = releaseDate;
        this.genres = genres;
        this.language = language;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getCreators() {
        return creators;
    }

    public void setCreators(ArrayList<String> creators) {
        this.creators = creators;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<String> genres) {
        this.genres = genres;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }





}
