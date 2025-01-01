package UI;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;

public class LoginController {

    @FXML
    private Button btnLogin;

    @FXML
    private TextArea emailField;

    @FXML
    private TextArea passwordField;

    @FXML
    private Label lblMessage;

    @FXML
    public void initialize() {
        btnLogin.setOnAction(event -> handleLogin());
    }

    private void handleLogin() {
        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();

        if (email.isEmpty() || password.isEmpty()) {
            lblMessage.setText("Please fill in all fields!");
        } else if (isValidCredentials(email, password)) {
            lblMessage.setText("Login successful!");
            // Proceed with next steps, e.g., navigating to another view
        } else {
            lblMessage.setText("Invalid email or password.");
        }
    }

    private boolean isValidCredentials(String email, String password) {
        // Replace this with actual validation logic
        return "admin@example.com".equals(email) && "password123".equals(password);
    }
}
