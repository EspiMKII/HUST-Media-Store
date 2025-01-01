// Main.java
package app;

import app.model.store.Store;
import app.test.StoreTest;
import app.view.LoginScreen;
import javafx.application.Application;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            // Initialize the Store instance
            Store store = StoreTest.test();

            // Pass the Store instance to the LoginScreen
            LoginScreen.setStore(store);
            Application.launch(LoginScreen.class, args);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}