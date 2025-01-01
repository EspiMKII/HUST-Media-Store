package app.model.store.interfaces;

import app.model.credentials_info.Staff;
import app.model.store.Store;
import app.model.media.*;
import java.util.ArrayList;

public class ManagerInterface extends StaffInterface {
    public ManagerInterface(Staff staff) {
        super(staff);
    }

    public void addStaff(Staff staff) {
        staff.getStore().getStaff().add(staff);
    }

    public void removeStaff(Staff staff) {
        staff.getStore().getStaff().remove(staff);
    }

    public ArrayList<Staff> getStaffList(Store store) {
        return store.getStaff();
    }

    public void modifyStaff(Staff staff, String email, String password, String name, String position, float salary, long purchasesRegistered, int sessionsCompleted, long[] sessionsDone) {
        staff.setEmail(email);
        staff.setPassword(password);
        staff.setName(name);
        staff.setPosition(position);
        staff.setSalary(salary);
        staff.setPurchasesRegistered(purchasesRegistered);
        staff.setSessionsCompleted(sessionsCompleted);
        staff.setSessionsDone(sessionsDone);
    }

    public void addMedia(Store store, Media media) {
        store.addMedia(media);
    }

    public void removeMedia(Store store, Media media) {
        store.removeMedia(media);
    }

    public void viewFinances(Store store) {
        // TODO: implement viewFinances
    }

}
