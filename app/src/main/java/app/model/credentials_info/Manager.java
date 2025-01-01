package app.model.credentials_info;

import java.util.Date;

public class Manager extends Staff{
    public Manager(String email, String password,
                   String name, Date startingDate, String position, float salary,
                   long purchasesRegistered, int sessionsCompleted, long[] sessionsDone) {
        super(email, password, 
              name, startingDate, position, salary, 
              purchasesRegistered, sessionsCompleted, sessionsDone);
        this.setManagerPerm(true);
    }
}
