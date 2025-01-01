package app.model.store;

import app.model.credentials_info.*;
import app.model.media.*;

import java.util.ArrayList;

public class Store {
    private ArrayList<Media> media;
    private ArrayList<Customer> customers;
    private ArrayList<Staff> staff; // viewing and modifying the staff list is a manager only interaction
    private ArrayList<Finances> finances;

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }

    public void addMedia(Media media) {
        this.media.add(media);
    }

    public void removeMedia(Media media) {
        this.media.remove(media);
    }

    public Media searchMedia(String title) {
        for (Media media : media) {
            if (media.getTitle().equals(title)) {
                return media;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }


    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public Customer searchCustomer(String name) {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }

    public ArrayList<Finances> getFinances() {
        return finances;
    }

    public void setFinances(ArrayList<Finances> finances) {
        this.finances = finances;
    }

    public Store(ArrayList<Media> media, ArrayList<Customer> customers, ArrayList<Staff> staff, ArrayList<Finances> finances) {
        this.media = media;
        this.customers = customers;
        this.staff = staff;
        this.finances = finances;
    }

    public Staff searchStaff(String name) {
        if (name != null) {
            for (Staff staff : staff) {
                if (staff.getName().equals(name)) {
                    return staff;
                }
                return null;
            }
        }
        return null;
    }
    public Staff searchStaffByEmail(String email) {
        if (email != null) {
            for (Staff staff : staff) {
                if (staff.getEmail().equals(email)) {
                    return staff;
                }
                return null;
            }
        }
        return null;
    }
}
