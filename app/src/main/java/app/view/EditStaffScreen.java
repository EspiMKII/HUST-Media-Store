package app.view;

import app.model.items.Staff;
import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import fxml.EditMediaScreenController;
import fxml.EditStaffScreenController;
import fxml.ManagerScreenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EditStaffScreen extends Application {

    private static Store store;

    private static ManagerInterface managerInterface;

    private static Staff selectedStaff;

    public static void begin() {
        launch();
    }

    public static void setStore(Store store) {
        EditStaffScreen.store = store;
    }

    public static void setManagerInterface(ManagerInterface managerInterface) {
        EditStaffScreen.managerInterface = managerInterface;
    }

    public static void setSelectedStaff (Staff selectedStaff) {
        EditStaffScreen.selectedStaff = selectedStaff;
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/EditStaffScreen.fxml"));
        Parent root = loader.load();

        // Pass the Store and ManagerInterface instance to the controller
        EditStaffScreenController controller = loader.getController();
        controller.setStore(store);
        controller.setManagerInterface(managerInterface);
        controller.setSelectedStaff(selectedStaff);

        primaryStage.setTitle("Edit Media");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }




}
