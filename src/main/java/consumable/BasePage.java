package consumable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.support.PageFactory.initElements;

public class BasePage {

    protected WebDriver driver;
    public WebDriverWait wait;
    public static final String STANDARD_USER_USERNAME = "standard_user";
    public static final String STANDARD_USER_PASSWORD = "secret_sauce";

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
        initElements(new DefaultElementLocatorFactory(driver), this);
    }

    public WebElement getWebElementWithParameters(String xpath, String... args) {
        String locator = getXpathWithParameters(xpath, args);
        return driver.findElement(xpath(locator));
    }

    private String getXpathWithParameters(String xpath, String... args) {
        return String.format(xpath, args);
    }
}
