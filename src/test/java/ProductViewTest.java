import consumable.TestSetUp;
import org.testng.annotations.Test;
import pages.LoginPage;

import static consumable.BasePage.STANDARD_USER_PASSWORD;
import static consumable.BasePage.STANDARD_USER_USERNAME;

public class ProductViewTest extends TestSetUp {

    private static final String SAUCE_LABS_BACKPACK_ITEM_NAME = "Sauce Labs Backpack";

    @Test
    public void iCanViewSingleProduct() {
        new LoginPage(driver)
                .openWebsite()
                .inputUsername(STANDARD_USER_USERNAME)
                .inputPassword(STANDARD_USER_PASSWORD)
                .clickLoginButton()
                .openProduct(SAUCE_LABS_BACKPACK_ITEM_NAME)
                    .assertThatProductNameIsDisplayed(SAUCE_LABS_BACKPACK_ITEM_NAME);
    }
}
