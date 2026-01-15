package РОМ;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InzhenerkaLoginTest {
    @Test
    @DisplayName("Проверка логина")
    public void runLoginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.setUsername("admin");
        loginPage.setPassword("admin123");
        loginPage.login();
        loginPage.logout();
    }

    @Test
    @DisplayName("Проверка логина как юзера")
    public void runLoginTestAsUser() {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.setUsername("user");
        loginPage.setPassword("user123");
        loginPage.login();
        loginPage.checkUserGreeting();
        loginPage.logout();
    }
}

