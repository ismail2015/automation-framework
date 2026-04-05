package mobile;

import base.MobileBaseTest;
import org.junit.jupiter.api.Test;
import pages.mobile.MobileLoginPage;

public class LoginMobileTest extends MobileBaseTest {

    @Test
    public void testMobileLogin() {
        MobileLoginPage loginPage = new MobileLoginPage(driver);
        loginPage.login("testuser", "testpass");
    }
}
