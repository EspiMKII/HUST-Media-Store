package app.model.items;

import java.util.Objects;

public class Customer {
    private int id;
    private String name;
    private int phoneNumber;
    private int points;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPoints() {
        return points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public Customer(String name, int phoneNumber, int points) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return phoneNumber == customer.phoneNumber && Objects.equals(name, customer.name);
    }
}
