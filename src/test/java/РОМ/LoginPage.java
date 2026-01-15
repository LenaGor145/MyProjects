package РОМ;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

    public class LoginPage extends BaseTest {
        // Локатор: Имя пользователя
        private final SelenideElement usernameField = $("#username");
        // Локатор: Пароль
        private final SelenideElement passwordField = $("[name='password']");
        // Локатор: Кнопка входа
        private final SelenideElement loginButton = $("button[type='submit']");
        // Локатор: Кнопка выхода
        private final SelenideElement logoutButton =$(byText("Выйти"));
        public final String USER_GREETING_TEXT = "Привет, user";
        // Проверка приветствия

        public void openPage() {
            String URL = "https://qa-stand-login.inzhenerka.tech/login";
            Selenide.open(URL);
        }

        // Методы для работы с этими элементами

        public void setUsername(String username) {
            // Ввод имени пользователя
            usernameField.setValue(username);
        }

        public void setPassword(String password) {
            // Ввод пароля
            passwordField.setValue(password);
        }

        public void login() {
            // Нажатие кнопки входа
            loginButton.click();
        }

        public void logout() {
            // Нажатие кнопки выхода
            logoutButton.click();
        }
        public void checkUserGreeting() {
            $("body").shouldHave(text(USER_GREETING_TEXT));
        }
    }

