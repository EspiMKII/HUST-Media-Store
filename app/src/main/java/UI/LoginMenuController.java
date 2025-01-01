package UI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class LoginMenuController {

    @FXML
    private Button loginButton;

    @FXML
    private TextArea emailField;

    @FXML
    private TextArea passwordField;

    @FXML
    private Label messageLabel;

    private Stage stage; 
    private Scene scene;
    private Parent root;

    public void loginHandler(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();

        if (isValidCredentials(email, password)) {
            try {
                switchToPurchaseScreen(event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            messageLabel.setText("Invalid email or password.");
            messageLabel.setVisible(true);
        }
    }

    private boolean isValidCredentials(String email, String password) {
        // Replace this with actual validation logic
        String emailFromDB = "manager.name@hms.com"; // there should be logic to get email from DB 
        String passwordFromDB = "password123"; //should correspond to emailFromDB

        return emailFromDB.equals(email) && passwordFromDB.equals(password);
    }

    public void switchToPurchaseScreen(ActionEvent event) throws Exception {
        root = FXMLLoader.load(getClass().getResource("UI/purchase-screen_cart.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
    }
}
