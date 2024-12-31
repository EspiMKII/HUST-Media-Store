package media;

import java.util.ArrayList;
import java.util.Date;

public class Book extends Media {
    private long pages;

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public Book(String title, ArrayList<String> creators, Date releaseDate, ArrayList<String> genres, String language,
                float price, long pages) {
        super(title, creators, releaseDate, genres, language, price);
        this.pages = pages;
    }
}
