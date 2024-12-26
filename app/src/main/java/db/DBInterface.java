package db;
import io.github.cdimascio.dotenv.*;

public class DBInterface {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.configure().load();
        System.out.println(dotenv.get("TEST"));
    }
}
