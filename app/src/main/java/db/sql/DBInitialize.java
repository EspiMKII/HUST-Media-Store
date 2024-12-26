package db.sql;

public class DBInitialize {

    public void initializeDatabase() throws Exception {
        try {
            DBInterface db = new DBInterface();
            db.executeFile("create/init.sql");
        }
        catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public DBInitialize() {
    }
}