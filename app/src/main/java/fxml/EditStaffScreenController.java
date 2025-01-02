package fxml;

import app.model.items.Staff;
import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class EditStaffScreenController {

    @FXML
    private ButtonBar addTypeSelector;

    @FXML
    private Button editStaffButton;

    @FXML
    private DatePicker editStaffDate;

    @FXML
    private TextField editStaffEmail;

    @FXML
    private TextField editStaffName;

    @FXML
    private TextField editStaffPassword;

    @FXML
    private TextField editStaffSalary;

    @FXML
    private Label specialLabel;

    private Store store;
    private ManagerInterface managerInterface;
    private ObservableList<Staff> storeStaff = FXCollections.observableArrayList();

    private Staff selectedStaff;

    public void setStore(Store store) {
        this.store = store;
    }

    public void setManagerInterface(ManagerInterface managerInterface) {
        this.managerInterface = managerInterface;
    }


    public void setSelectedStaff(Staff staff) {
        this.selectedStaff = staff;
        populateFields();
    }

    private void populateFields() {
        editStaffName.setText(selectedStaff.getName());
        editStaffEmail.setText(selectedStaff.getEmail());
        editStaffPassword.setText(selectedStaff.getPassword());
        editStaffSalary.setText(String.valueOf(selectedStaff.getSalary()));
        editStaffDate.setValue(LocalDate.parse(selectedStaff.getStartingDate().toString()));
    }

    @FXML
    void onEditStaffPressed(ActionEvent event) {
        String name = editStaffName.getText();
        String email = editStaffEmail.getText();
        String password = editStaffPassword.getText();
        float salary = Float.parseFloat(editStaffSalary.getText());
        LocalDate localDate = editStaffDate.getValue();
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());

        Staff newStaff = new Staff(email, password, name, date, "Staff", salary, 0, 0 , new int[] {0,0,0});
        store.updateStaff(selectedStaff, newStaff);
    }

}
