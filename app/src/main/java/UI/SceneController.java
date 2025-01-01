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

        switchScene("LoginMenu.fxml");

        primaryStage.show();
    }

    public static void switchScene(String fxmlFile) throws Exception {
        Parent root = FXMLLoader.load(SceneController.class.getResource(fxmlFile));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
