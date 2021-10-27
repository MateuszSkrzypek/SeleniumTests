import consumable.TestSetUp;
import org.testng.annotations.Test;
import pages.LoginPage;

import static consumable.BasePage.STANDARD_USER_PASSWORD;
import static consumable.BasePage.STANDARD_USER_USERNAME;

public class LoginTest extends TestSetUp {

    @Test
    public void iCanSuccessfullyLoginAsStandardUser() {
        new LoginPage(driver)
                .openWebsite()
                .inputUsername(STANDARD_USER_USERNAME)
                .inputPassword(STANDARD_USER_PASSWORD)
                .clickLoginButton()
                    .assertThatICanSeeProductSelect();
    }
}
