package app.model.credentials_info;

public class Customer {
    private int id;
    private String name;
    private long phoneNumber;
    private int points;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
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
    public Customer(String name, long phoneNumber, int points) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.points = points;
    }
}
