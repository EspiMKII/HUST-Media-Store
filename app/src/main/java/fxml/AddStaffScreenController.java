package fxml;

import app.model.items.Manager;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class AddStaffScreenController {

    @FXML
    private RadioButton addSelectorManager;

    @FXML
    private RadioButton addSelectorStaff;

    @FXML
    private Button addStaffButton;

    @FXML
    private TextField addStaffDate;

    @FXML
    private TextField addStaffEmail;

    @FXML
    private TextField addStaffName;

    @FXML
    private TextField addStaffPassword;

    @FXML
    private TextField addStaffSalary;

    @FXML
    private ButtonBar addStaffSelector;

    @FXML
    private ButtonBar addTypeSelector;

    @FXML
    private Label specialLabel;

    private Store store;
    private ManagerInterface managerInterface;
    private ObservableList<Staff> storeStaff = FXCollections.observableArrayList();

    public void setStore(Store store) {
        this.store = store;
    }

    public void setManagerInterface(ManagerInterface managerInterface) {
        this.managerInterface = managerInterface;
    }




    @FXML
    void onAddStaffPressed(ActionEvent event) {
        String name = addStaffName.getText();
        String email = addStaffEmail.getText();
        String password = addStaffPassword.getText();
        float salary = Float.parseFloat(addStaffSalary.getText());
        int year = Integer.parseInt(addStaffDate.getText());
        Staff newStaff = new Staff(email, password, name, year, "Staff", salary, 0, 0 , new int[] {0,0,0});        managerInterface.addStaff(store, newStaff);
        storeStaff.add(newStaff);

    }

}
