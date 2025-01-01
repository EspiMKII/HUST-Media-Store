package app.model.media;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.ArrayList;
import java.util.Date;

public abstract class Media {
    private SimpleStringProperty title;
    private SimpleFloatProperty price;
    private SimpleStringProperty type;
    private SimpleIntegerProperty year;
    private SimpleStringProperty genre;
    private SimpleStringProperty language;


    public Media(String title, ArrayList<String> creators, Date releaseDate, ArrayList<String> genres, String language, float price) {
        this.title = new SimpleStringProperty(title);
        this.price = new SimpleFloatProperty(price);
        this.type = new SimpleStringProperty(this.getClass().getSimpleName().toLowerCase());
        this.year = new SimpleIntegerProperty(releaseDate.getYear() + 1900); // Adjust for Date year offset
        this.genre = new SimpleStringProperty(String.join(", ", genres));
        this.language = new SimpleStringProperty(language);
    }

    public String getLanguage() {
        return language.get();
    }

    public SimpleStringProperty languageProperty() {
        return language;
    }


    public String getTitle() {
        return title.get();
    }


    public SimpleStringProperty titleProperty() {
        return title;
    }

    public float getPrice() {
        return price.get();
    }

    public SimpleFloatProperty priceProperty() {
        return price;
    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public int getYear() {
        return year.get();
    }

    public SimpleIntegerProperty yearProperty() {
        return year;
    }

    public String getGenre() {
        return genre.get();
    }

    public SimpleStringProperty genreProperty() {
        return genre;
    }
}