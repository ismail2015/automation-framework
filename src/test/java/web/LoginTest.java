package web;

import base.WebBaseTest;
import org.junit.jupiter.api.Test;
import pages.web.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends WebBaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        assertTrue(driver.getCurrentUrl().contains("inventory"));
    }
}
