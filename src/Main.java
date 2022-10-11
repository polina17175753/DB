import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин");
        String username = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        DBConnection connect = new DBConnection();
        connect.DBConnection();

    }
}