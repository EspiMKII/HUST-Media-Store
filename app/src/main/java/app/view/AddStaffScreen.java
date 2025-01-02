package app.view;

import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import fxml.AddStaffScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddStaffScreen extends Application {

    private static Store store;
    private static ManagerInterface managerInterface;

    public static void begin() {
        launch();
    }

    public static void setStore(Store store) {
        AddStaffScreen.store = store;
    }

    public static void setManagerInterface(ManagerInterface managerInterface) {
        AddStaffScreen.managerInterface = managerInterface;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/AddStaffScreen.fxml"));
        Scene scene = new Scene(loader.load());

        // Pass the Store and ManagerInterface instance to the controller
        AddStaffScreenController controller = loader.getController();
        controller.setStore(store);
        controller.setManagerInterface(managerInterface);

        primaryStage.setTitle("Add Staff");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}