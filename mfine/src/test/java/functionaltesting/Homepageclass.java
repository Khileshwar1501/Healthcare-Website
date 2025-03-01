package functionaltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepageclass {
	
	private WebDriver driver;
    private By searchBox = By.id("search-input");
    private By searchButton = By.id("search-button");

    public void HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }
}

