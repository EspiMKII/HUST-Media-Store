package app.model.media;

import javafx.beans.property.SimpleIntegerProperty;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Media {
    private SimpleIntegerProperty pages;

    public Book(String title, ArrayList<String> creators, int releaseYear, ArrayList<String> genres, String language, float price, int pages) {
        super(title, creators, releaseYear, genres, language, price);
        this.pages = new SimpleIntegerProperty(pages);
    }

    public int getPages() {
        return pages.get();
    }

    public SimpleIntegerProperty pagesProperty() {
        return pages;
    }
}