package fxml;

import app.model.store.Store;
import app.model.store.interfaces.LoginInterface;
import app.model.store.interfaces.human.ManagerInterface;
import app.model.store.interfaces.human.StaffInterface;
import app.view.LoginScreen;
import app.view.StaffScreen;
import app.view.ManagerScreen;
import app.view.PopupWindow;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginScreenController extends LoginInterface {
    private Store store;

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Text statusText;

    public void setStore(Store store) {
        this.store = store;
    }



    @FXML
    void onLoginPressed(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        StaffInterface staffInterface = login(store, email, password);
        if (staffInterface != null) {
            // Close the LoginScreen
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.close();

            try {
                if (staffInterface instanceof ManagerInterface) {
                    // Open the ManagerScreen
                    ManagerScreen managerScreen = new ManagerScreen();
                    ManagerScreen.setStore(store);
                    ManagerScreen.setManagerInterface((ManagerInterface) staffInterface);
                    Stage managerStage = new Stage();
                    managerScreen.start(managerStage);
                } else {
                    // Open the StaffScreen
                    StaffScreen staffScreen = new StaffScreen();
                    StaffScreen.setStore(store);
                    StaffScreen.setStaffInterface(staffInterface);
                    Stage staffStage = new Stage();
                    staffScreen.start(staffStage);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            statusText.setText("Login failed. Please try again.");
        }
    }

    public static StaffInterface login(Store store, String email, String password) {
        if (store.searchStaffByEmail(email) == null) {
            System.out.println("User does not exist");
            return null;
        }
        else {
            if (password.equals(store.searchStaffByEmail(email).getPassword())) {
                if (store.searchStaffByEmail(email).isManager()) {
                    System.out.println("Login successful as manager");
                    return new ManagerInterface(store.searchStaffByEmail(email));

                } else {
                    System.out.println("Login successful as staff");
                    return new StaffInterface(store.searchStaffByEmail(email));
                }
            } else {
                System.out.println("Login failed");
                return null;
            }
        }
    }
}