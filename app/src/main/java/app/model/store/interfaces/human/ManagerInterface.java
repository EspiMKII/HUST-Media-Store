package app.model.store.interfaces.human;

import app.model.store.Finances;
import app.model.items.Staff;
import app.model.store.Store;
import app.model.media.*;
import java.util.ArrayList;

public class ManagerInterface extends StaffInterface {
    public ManagerInterface(Staff staff) {
        super(staff);
    }

    public void addStaff(Store store, Staff staff) {
        store.getStaff().add(staff);
    }

    public void removeStaff(Store store, Staff staff) {
        store.getStaff().remove(staff);
    }

    public ArrayList<Staff> getStaffList(Store store) {
        return store.getStaff();
    }

    public void modifyStaff(Staff staff, String email, String password, String name, String position, float salary, int purchasesRegistered, int sessionsCompleted, int[] sessionsDone) {
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

    public ArrayList<Finances> getFinances(Store store) {
        return store.getFinances();
    }
    public void addFinanceEntry (Store store, Finances finance) {
        store.getFinances().add(finance);
    }
}
