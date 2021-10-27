package pages;

import consumable.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class ProductPage extends BasePage {

    private static final String ITEM_NAME_XPATH_SELECTOR = "//div[@class='inventory_details_name large_size' and contains(text(),'%s')]";

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage assertThatProductNameIsDisplayed(String productName) {
        WebElement productNameElement = getWebElementWithParameters(ITEM_NAME_XPATH_SELECTOR, productName);
        assertTrue(productNameElement.isDisplayed(), "Product name: " + productName + " is not displayed");
        return this;
    }
}
