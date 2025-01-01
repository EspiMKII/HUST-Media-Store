package app.model.credentials_info;

import app.model.store.Store;

import java.util.Arrays;
import java.util.Date;

public class Staff {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String email;
    private String password;

    private String name;
    private Date startingDate;
    private String position;
    private float salary;

    private int purchasesRegistered;
    private int sessionsCompleted;
     // the 2 previous variables are used to calculate this one, which is why they won't have getters and setters
    private int[] sessionsDone = new int[3]; // purchases sessions done this week, this month, and this year

    private Boolean managerPerm = false;
    
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getStartingDate() {
        return startingDate;
    }
    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public float getSalary() {
        return salary;
    }

    public int getPurchasesRegistered() {
        return purchasesRegistered;
    }
    public void setPurchasesRegistered(int purchasesRegistered) {
        this.purchasesRegistered = purchasesRegistered;
    }
    public int getSessionsCompleted() {
        return sessionsCompleted;
    }
    public void setSessionsCompleted(int sessionsCompleted) {
        this.sessionsCompleted = sessionsCompleted;
    }

    public float getAvgPurchasesPerSession() {
        return (float) purchasesRegistered / sessionsCompleted;
    }
    public int[] getSessionsDone() {
        return sessionsDone;
    }
    public void setSessionsDone(int[] sessionsDone) {
        this.sessionsDone = sessionsDone;
    }

    public Boolean getManagerPerm() {
        return managerPerm;
    }
    public void setManagerPerm(Boolean managerPerm) {
        this.managerPerm = managerPerm;
    }
    public boolean isManager() {
        return managerPerm;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", startingDate=" + startingDate +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", purchasesRegistered=" + purchasesRegistered +
                ", sessionsCompleted=" + sessionsCompleted +
                ", sessionsDone=" + Arrays.toString(sessionsDone) +
                ", managerPerm=" + managerPerm +
                '}';
    }

    public Staff(String email, String password,
                 String name, Date startingDate, String position, float salary,
                 int purchasesRegistered, int sessionsCompleted, int[] sessionsDone) {
        this.email = email;
        this.password = password;

        this.name = name;
        this.startingDate = startingDate;
        this.position = position;
        this.salary = salary;

        this.purchasesRegistered = purchasesRegistered;
        this.sessionsCompleted = sessionsCompleted;
        this.sessionsDone = sessionsDone;
    }
}
