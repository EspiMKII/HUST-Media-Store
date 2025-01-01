package app.model.store;

import app.model.credentials_info.Customer;
import app.model.media.Media;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered;
    private int itemCount;
    private float totalPrice;
    private Customer customer;

    public void addItem(Media item) {
        if (item != null) {
            itemsOrdered.add(item);
            itemCount++;
            totalPrice += item.getPrice();
        }
        else {
            System.out.println("Item is null");
        }
    }

    private void removeItem(Media item) {
        itemsOrdered.remove(item);
        itemCount--;
        totalPrice -= item.getPrice();
    }

    public void checkOut() {
        itemsOrdered.clear();
        itemCount = 0;
        totalPrice = 0;
    }

    public ArrayList<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void sortItemsOrdered() {
        // TODO: sort itemsOrdered by title
    }

    public int getItemCount() {
        return itemCount;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int pointsEarned() {
        return (int) totalPrice / 10;
    }


    public Cart(Customer customer) {
        this.itemsOrdered = new ArrayList<Media>();
        this.itemCount = 0;
        this.totalPrice = 0;
        this.customer = customer;
    }
}
