package app.view;

import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import fxml.AddMediaScreenController;
import fxml.ManagerScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddMediaScreen extends Application {

    private static Store store;

    private static ManagerInterface managerInterface;

    public static void begin() {
        launch();
    }

    public static void setStore(Store store) {
        AddMediaScreen.store = store;
    }

    public static void setManagerInterface(ManagerInterface managerInterface) {
        AddMediaScreen.managerInterface = managerInterface;
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AddMediaScreen.fxml"));
        Parent root = loader.load();

        // Pass the Store and ManagerInterface instance to the controller
        AddMediaScreenController controller = loader.getController();
        controller.setStore(store);
        controller.setManagerInterface(managerInterface);

        primaryStage.setTitle("Add Media");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }




}
