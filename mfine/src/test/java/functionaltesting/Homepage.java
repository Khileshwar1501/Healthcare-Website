package functionaltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	private WebDriver driver;

    // Locators for home page elements
    private By searchBox = By.id("search-input");
    private By searchButton = By.id("search-button");
    private By productList = By.className("product-list");

    public void HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions on Home Page
    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public boolean isProductListDisplayed() {
        return driver.findElement(productList).isDisplayed();
    }
}