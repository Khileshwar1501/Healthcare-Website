package functionaltesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProductService {
	private static final String URL = "jdbc:mysql://localhost:3306/mfine";  // Database URL
    private static final String USER = "root";  // Database user
    private static final String PASSWORD = "password";  // Database password

    public static Connection getConnection() throws SQLException {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Database driver not found.", e);
        }
    }
}


