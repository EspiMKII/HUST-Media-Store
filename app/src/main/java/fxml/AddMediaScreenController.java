package fxml;

import app.model.items.Staff;
import app.model.media.*;
import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import app.model.store.interfaces.human.StaffInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddMediaScreenController {

    @FXML
    private TextField addAuthors;

    @FXML
    private DatePicker addDate;

    @FXML
    private TextField addGenre;

    @FXML
    private TextField addLanguage;

    @FXML
    private Button addMediaButton;

    @FXML
    private TextField addPrice;

    @FXML
    private RadioButton addSelectionBook;

    @FXML
    private RadioButton addSelectionCD;

    @FXML
    private RadioButton addSelectionDVD;

    @FXML
    private TextField addSpecial;

    @FXML
    private TextField addTitle;

    @FXML
    private ButtonBar addTypeSelector;

    @FXML
    private Label specialLabel;

    private Store store;
    private ManagerInterface managerInterface;
    private ObservableList<Media> storeItems = FXCollections.observableArrayList();

    @FXML
    void initialize() {
        addSelectionBook.setOnAction(event -> specialLabel.setText("Pages"));
        addSelectionCD.setOnAction(event -> specialLabel.setText("Tracks"));
        addSelectionDVD.setOnAction(event -> specialLabel.setText("Length"));
    }

    @FXML
    void onAddMediaPressed(ActionEvent event) {
        String title = addTitle.getText();
        String authors = addAuthors.getText();
        String genre = addGenre.getText();
        String language = addLanguage.getText();
        float price = Float.parseFloat(addPrice.getText());
        Date date = java.sql.Date.valueOf(addDate.getValue());

        if (addSelectionBook.isSelected()) {
            int pages = Integer.parseInt(addSpecial.getText());
            Book book = new Book(title, new ArrayList<>(List.of(authors.split(","))), date, new ArrayList<>(List.of(genre.split(","))), language, price, pages);
            managerInterface.addMedia(store, book);
            storeItems.add(book);
        } else if (addSelectionDVD.isSelected()) {
            int duration = Integer.parseInt(addSpecial.getText());
            DVD dvd = new DVD(title, new ArrayList<>(List.of(authors.split(","))), date, new ArrayList<>(List.of(genre.split(","))), language, price, duration);
            managerInterface.addMedia(store, dvd);
            storeItems.add(dvd);
        } else if (addSelectionCD.isSelected()) {
            String tracks = (addSpecial.getText());
            String[] trackList = tracks.split(",");
            ArrayList<Track> trackArrayList = new ArrayList<>();
            for (String track : trackList) {
                String[] trackInfo = track.split(":");
                trackArrayList.add(new Track(trackInfo[0], Integer.parseInt(trackInfo[1])));
            }
            CD cd = new CD(title, new ArrayList<>(List.of(authors)), date, new ArrayList<>(List.of(genre.split(","))), language, price, trackArrayList);
            managerInterface.addMedia(store, cd);
            storeItems.add(cd);
        }
    }


    public void setStore(Store store) {
        this.store = store;
        storeItems.setAll(store.getMedia());
    }

    public void setManagerInterface(ManagerInterface managerInterface) {
        this.managerInterface = managerInterface;
    }


}
