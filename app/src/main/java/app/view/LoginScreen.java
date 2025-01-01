package app.view;

import app.model.store.Store;
import fxml.LoginScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreen extends Application {
    private static Store store;

    public static void setStore(Store store) {
        LoginScreen.store = store;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/LoginScreen.fxml"));
        Parent root = loader.load();

        // Pass the Store instance to the controller
        LoginScreenController controller = loader.getController();
        controller.setStore(store);

        primaryStage.setTitle("Login Screen");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void begin() {
        launch();
    }
}