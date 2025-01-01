package app.model.credentials_info;

import app.model.store.Store;

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

    private long purchasesRegistered;
    private int sessionsCompleted;
    private float avgPurchasesPerSession;; // the 2 previous variables are used to calculate this one, which is why they won't have getters and setters
    private long[] sessionsDone = new long[3]; // purchases sessions done this week, this month, and this year

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

    public long getPurchasesRegistered() {
        return purchasesRegistered;
    }
    public void setPurchasesRegistered(long purchasesRegistered) {
        this.purchasesRegistered = purchasesRegistered;
    }
    public int getSessionsCompleted() {
        return sessionsCompleted;
    }
    public void setSessionsCompleted(int sessionsCompleted) {
        this.sessionsCompleted = sessionsCompleted;
    }

    public float getAvgPurchasesPerSession() {
        avgPurchasesPerSession = (float) purchasesRegistered / sessionsCompleted;
        return avgPurchasesPerSession;
    }
    public void setAvgPurchasesPerSession(int avgPurchasesPerSession) {
        this.avgPurchasesPerSession = avgPurchasesPerSession;
    }
    public long[] getSessionsDone() {
        return sessionsDone;
    }
    public void setSessionsDone(long[] sessionsDone) {
        this.sessionsDone = sessionsDone;
    }

    public Boolean getManagerPerm() {
        return managerPerm;
    }
    public void setManagerPerm(Boolean managerPerm) {
        this.managerPerm = managerPerm;
    }

    public Staff(String email, String password, 
                 String name, Date startingDate, String position, float salary,
                 long purchasesRegistered, int sessionsCompleted, long[] sessionsDone) {
        this.email = email;
        this.password = password;

        this.name = name;
        this.startingDate = startingDate;
        this.position = position;
        this.salary = salary;

        this.purchasesRegistered = purchasesRegistered;
        this.sessionsCompleted = sessionsCompleted;
        this.avgPurchasesPerSession = (int) (purchasesRegistered / sessionsCompleted);
        this.sessionsDone = sessionsDone;
    }
}
