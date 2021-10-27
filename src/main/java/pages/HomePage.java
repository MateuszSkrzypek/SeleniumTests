package pages;

import consumable.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;

public class HomePage extends BasePage {

    private static final String INVENTORY_ITEM_XPATH_SELECTOR = "//div[@class='inventory_item_name' and contains(text(),'%s')]";

    @FindBy(css = "[data-test='product_sort_container']")
    private WebElement productSelect;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ProductPage openProduct(String product) {
        WebElement productNameLink = getWebElementWithParameters(INVENTORY_ITEM_XPATH_SELECTOR, product);
        productNameLink.click();
        return new ProductPage(driver);
    }

    public HomePage assertThatICanSeeProductSelect() {
        assertTrue(productSelect.isDisplayed());
        return this;
    }
}
