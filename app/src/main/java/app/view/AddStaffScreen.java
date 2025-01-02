package app.view;

import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import fxml.ManagerScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddStaffScreen extends Application {

    private static Store store;

    private static ManagerInterface managerInterface;

    public static void begin() {
        launch();
    }

    public static void setStore(Store store) {
        AddMediaScreen.setStore(store);
    }

    public static void setManagerInterface(ManagerInterface managerInterface) {
        AddMediaScreen.setManagerInterface(managerInterface);
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AddStaffScreen.fxml"));
        Parent root = loader.load();

        // Pass the Store and ManagerInterface instance to the controller
        ManagerScreenController controller = loader.getController();
        controller.setStore(store);
        controller.setManagerInterface(managerInterface);

        primaryStage.setTitle("Add Staff");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }




}
