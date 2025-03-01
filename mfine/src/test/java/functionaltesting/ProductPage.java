package functionaltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	private WebDriver driver;

    private By addToCartButton = By.id("add-to-cart");
    private By productTitle = By.cssSelector("h1.product-title");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions on Product Page
    public void addProductToCart() {
        driver.findElement(addToCartButton).click();
    }

    public String getProductTitle() {
        return driver.findElement(productTitle).getText();
    }
}

