package simplilearn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.openqa.selenium.devtools.v101.database.Database;

public class Productserviceclass {
	
	public boolean addProduct(Product product) {
        String sql = "INSERT INTO products (name, description, price, stock) VALUES (?, ?, ?, ?)";

        try (Connection connection = Database.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            // Set the parameters for the SQL query
            stmt.setString(1, ((Object) product).getName());
            stmt.setString(2, product.getDescription());
            stmt.setBigDecimal(3, product.getPrice());
            stmt.setInt(4, product.getStock());

            // Execute the query
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;  // Return true if a row was inserted

        } catch (SQLException e) {
            System.out.println("Error while adding product: " + e.getMessage());
            return false;
        }
    }
}

}
