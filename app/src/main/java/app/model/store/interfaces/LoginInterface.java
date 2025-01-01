package app.model.store.interfaces;

import app.model.store.Store;
import app.model.store.interfaces.human.ManagerInterface;
import app.model.store.interfaces.human.StaffInterface;

public class LoginInterface {
    public static StaffInterface login(Store store, String email, String password) {
        if (store.searchStaffByEmail(email) == null) {
            System.out.println("User does not exist");
            return null;
        }
        else {
        if (password.equals(store.searchStaffByEmail(email).getPassword())) {
            if (store.searchStaffByEmail(email).isManager()) {
                System.out.println("Login successful as manager");
                return new ManagerInterface(store.searchStaffByEmail(email));

            } else {
                System.out.println("Login successful as staff");
                return new StaffInterface(store.searchStaffByEmail(email));
            }
        } else {
            System.out.println("Login failed");
            return null;
        }
        }
    }
}
