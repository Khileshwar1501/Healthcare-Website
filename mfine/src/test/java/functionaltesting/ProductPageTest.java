package functionaltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductPageTest {
	
	WebDriver driver;

    @Test
    public void testAddProductToCart() {
        // Setup WebDriver
        driver = new ChromeDriver();
        driver.get("https://mfine.com/product/aspirin");

        // Using Product Page Object
        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart();

        // Verify product was added to cart
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"));

        // Cleanup
        driver.quit();
    }
}

