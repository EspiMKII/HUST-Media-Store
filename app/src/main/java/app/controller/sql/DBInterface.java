package app.controller.sql;

import io.github.cdimascio.dotenv.Dotenv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Objects;

public class DBInterface {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            Dotenv dotenv = Dotenv.configure().load();
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(dotenv.get("DB_URL"), dotenv.get("DB_USER"), dotenv.get("DB_PASSWORD"));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public void executeFile(String file, Object... params) throws SQLException, IOException, ClassNotFoundException {
        try (Connection con = DBInterface.getConnection();
             InputStreamReader isr = new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("sql/%s".formatted(file))));
             BufferedReader br = new BufferedReader(isr)) {

            StringBuilder query = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                if (line.trim().startsWith("-- ")) {
                    continue;
                }

                query.append(line).append(" ");

                if (line.trim().endsWith(";")) {
                    try (PreparedStatement ps = con.prepareStatement(query.toString().trim())) {
                        for (int i = 0; i < params.length; i++) {
                            ps.setObject(i + 1, params[i]);
                        }
                        ps.execute();
                    }
                    query = new StringBuilder();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String pullTable(String table) {
        try (Connection con = DBInterface.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM %s".formatted(table))) {

            StringBuilder result = new StringBuilder();
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            // Append column names
            for (int i = 1; i <= columnsNumber; i++) {
                result.append(rsmd.getColumnName(i)).append(", ");
            }
            result.append("\n");

            // Append rows
            while (rs.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) result.append(", ");
                    String columnValue = rs.getString(i);
                    result.append(columnValue);
                }
                result.append("\n");
            }
            return result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }

    }
    public DBInterface() {
    }
}