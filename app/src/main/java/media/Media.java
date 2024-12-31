package media;

import java.util.ArrayList;

public class Media {
    private String title;
    private ArrayList<String> creators;
    private String date;
    private ArrayList<String> genres;
    private String language;
    private float price;
    
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
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
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
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
}
