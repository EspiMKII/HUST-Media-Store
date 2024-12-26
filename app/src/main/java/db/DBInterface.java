package db;
import java.sql.*;

public class DBInterface {
    public static void main(String[] args) throws Exception {
        DBInitialize db = new DBInitialize();
        Statement st = db.getStatement();
        st.executeUpdate("INSERT INTO Media (Type, Title, Author, Category, Length, StockCost, SaleCost, Count) VALUES ('Book', 'Test', 'Test', 'Test', 432, 9, 11, 54)");
    }
}
