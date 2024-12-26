package db;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.*;
import java.sql.*;
import java.util.*;

public class DBInitialize {
    public Statement getStatement() throws Exception {
        try {
            Dotenv dotenv = Dotenv.configure().load();
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(dotenv.get("DB_URL"), dotenv.get("DB_USER"), dotenv.get("DB_PASSWORD"));
            return con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void initializeDatabase() throws Exception {
        try (Statement st = getStatement();
             InputStreamReader isr = new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("sql/init.sql")));
             BufferedReader br = new BufferedReader(isr)) {

            StringBuilder query = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("-- ")) {
                    continue;
                }

                query.append(line).append(" ");

                if (line.trim().endsWith(";")) {
                    st.execute(query.toString().trim());
                    query = new StringBuilder();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public DBInitialize() {
    }
}