package UI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        SceneController.primaryStage = primaryStage;
        primaryStage.setTitle("HUST Media Store");

        switchScene("/UI/purchaseScreenCart.fxml");

        primaryStage.show();
    }

    public static void switchScene(String fxmlFile) throws Exception {
        if (primaryStage == null) {
            throw new IllegalStateException("Primary stage is not initialized.");
        }

        Parent root = FXMLLoader.load(SceneController.class.getResource(fxmlFile));
        if (root == null) {
            throw new IllegalArgumentException("FXML file not found: " + fxmlFile);
        }

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
