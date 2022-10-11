import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    public void DBConnection() {
        String jdbcURL = "jdbc:postgresql://46.229.214.241:5432/popova_travel";
        String username = "Popovaa";
        String password = "Popovaa";
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Подключение");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        }

    }
}
