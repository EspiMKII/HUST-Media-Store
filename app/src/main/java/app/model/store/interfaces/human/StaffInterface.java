package app.model.store.interfaces.human;

import app.model.items.Staff;
import app.model.media.Media;
import app.model.store.Cart;
import app.model.store.Store;

import java.util.ArrayList;

public class StaffInterface {
    private Staff staff;

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void checkOut(Cart cart) {
        staff.setPurchasesRegistered(staff.getPurchasesRegistered() + 1);
        cart.getCustomer().setPoints(cart.getCustomer().getPoints() + cart.pointsEarned());
        cart.checkOut();
        System.out.println("Checkout successful");
;
    }
    public ArrayList<Media> getStoreMedia(Store store) {
        return store.getMedia();
    }
    public Staff returnSelf() {
        return staff;
    }

    public void Login(String username, String password) {
        // TODO: implement login
    }

    public StaffInterface(Staff staff) {
        this.staff = staff;
    }
}
