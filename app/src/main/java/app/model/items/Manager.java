package app.model.items;

import java.util.Date;

public class Manager extends Staff{
    public Manager(String email, String password,
                   String name, int startingYear, String position, float salary,
                   int purchasesRegistered, int sessionsCompleted, int[] sessionsDone) {
        super(email, password, 
              name, startingYear, position, salary,
              purchasesRegistered, sessionsCompleted, sessionsDone);
        this.setManagerPerm(true);
    }
}
