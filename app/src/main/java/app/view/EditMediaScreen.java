package app.view;

import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import fxml.ManagerScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EditMediaScreen extends Application {

    private static Store store;

    private static ManagerInterface managerInterface;

    public static void begin() {
        launch();
    }

    public static void setStore(Store store) {
        EditMediaScreen.store = store;
    }

    public static void setManagerInterface(ManagerInterface managerInterface) {
        EditMediaScreen.managerInterface = managerInterface;
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EditMediaScreen.fxml"));
        Parent root = loader.load();

        // Pass the Store and ManagerInterface instance to the controller
        ManagerScreenController controller = loader.getController();
        controller.setStore(store);
        controller.setManagerInterface(managerInterface);

        primaryStage.setTitle("Edit Media");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }




}
