package fxml;

import app.model.media.*;
import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EditMediaScreenController {

    @FXML
    private TextField editAuthors;

    @FXML
    private TextField editDate;

    @FXML
    private TextField editGenre;

    @FXML
    private TextField editLanguage;

    @FXML
    private TextField editPrice;

    @FXML
    private RadioButton editSelectionBook;

    @FXML
    private RadioButton editSelectionCD;

    @FXML
    private RadioButton editSelectionDVD;

    @FXML
    private TextField editSpecial;

    @FXML
    private TextField editTitle;

    @FXML
    private Label specialLabel;

    @FXML
    private Button editMediaButton;

    private Store store;
    private ManagerInterface managerInterface;
    private Media selectedMedia;

    public void setStore(Store store) {
        this.store = store;
    }

    public void setManagerInterface(ManagerInterface managerInterface) {
        this.managerInterface = managerInterface;
    }

    public void setSelectedMedia(Media media) {
        this.selectedMedia = media;
        populateFields();
    }

    private void populateFields() {
        editTitle.setText(selectedMedia.getTitle());
        editAuthors.setText(String.join(",", selectedMedia.getAuthors()));
        editDate.setText(String.valueOf(selectedMedia.getYear()));
        editGenre.setText(String.join(",", selectedMedia.getGenre()));
        editLanguage.setText(selectedMedia.getLanguage());
        editPrice.setText(String.valueOf(selectedMedia.getPrice()));

        if (selectedMedia instanceof Book) {
            editSelectionBook.setSelected(true);
            specialLabel.setText("Pages");
            editSpecial.setText(String.valueOf(((Book) selectedMedia).getPages()));
        } else if (selectedMedia instanceof DVD) {
            editSelectionDVD.setSelected(true);
            specialLabel.setText("Length");
            editSpecial.setText(String.valueOf(((DVD) selectedMedia).getDuration()));
        } else if (selectedMedia instanceof CD) {
            editSelectionCD.setSelected(true);
            specialLabel.setText("Tracks");
            editSpecial.setText(String.valueOf(((CD) selectedMedia).getTracksAmount()));
        }
    }

    @FXML
    void onEditMediaPressed(ActionEvent event) {
        String title = editTitle.getText();
        String authors = editAuthors.getText();
        String genre = editGenre.getText();
        String language = editLanguage.getText();
        float price = Float.parseFloat(editPrice.getText());
        int year = (Integer.parseInt(editDate.getText()));

        if (editSelectionBook.isSelected()) {
            int pages = Integer.parseInt(editSpecial.getText());
            Book book = new Book(title, new ArrayList<>(List.of(authors.split(","))), year, new ArrayList<>(List.of(genre.split(","))), language, price, pages);
            store.updateMedia(selectedMedia, book);
        } else if (editSelectionDVD.isSelected()) {
            int duration = Integer.parseInt(editSpecial.getText());
            DVD dvd = new DVD(title, new ArrayList<>(List.of(authors.split(","))), year, new ArrayList<>(List.of(genre.split(","))), language, price, duration);
            store.updateMedia(selectedMedia, dvd);
        } else if (editSelectionCD.isSelected()) {
            String tracks = (editSpecial.getText());
            String[] trackList = tracks.split(",");
            ArrayList<Track> trackArrayList = new ArrayList<>();
            for (String track : trackList) {
                String[] trackInfo = track.split(":");
                trackArrayList.add(new Track(trackInfo[0], Integer.parseInt(trackInfo[1])));
            }
            CD cd = new CD(title, new ArrayList<>(List.of(authors)), year, new ArrayList<>(List.of(genre.split(","))), language, price, trackArrayList);
            store.updateMedia(selectedMedia, cd);
        }
    }
}