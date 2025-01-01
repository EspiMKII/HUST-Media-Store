// StaffScreen.java
package app.view;

import app.model.store.Store;
import app.model.store.interfaces.human.StaffInterface;
import fxml.StaffScreenController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StaffScreen {
    private static Store store;
    private static StaffInterface staffInterface;

    public static void setStore(Store store) {
        StaffScreen.store = store;
    }

    public static void setStaffInterface(StaffInterface staffInterface) {
        StaffScreen.staffInterface = staffInterface;
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/StaffScreen.fxml"));
        Parent root = loader.load();

        // Pass the Store and StaffInterface instance to the controller
        StaffScreenController controller = loader.getController();
        controller.setStore(store);
        controller.setStaffInterface(staffInterface);

        primaryStage.setTitle("Staff Screen");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}