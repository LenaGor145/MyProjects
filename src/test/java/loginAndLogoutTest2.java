import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class loginAndLogoutTest2 {

    @Test
    void loginAndLogoutTest() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";

        // 1. Открываем сайт
        open("http://qa-stand-login.inzhenerka.tech/login");

        // --- ЧАСТЬ 1: Успешный вход ---
        $("#username").setValue("admin");
        $(By.name("password")).setValue("admin123");
        $("button[type='submit']").click();
        $(byText("Выйти")).shouldBe(visible);


        $(byText("Выйти")).click();
        $(byText("Войти")).shouldBe(visible); // проверка выхода

        $("#username").setValue("");
        $(By.name("password")).setValue("");
        $(byText("Войти")).click(); // один клик
        if ($(byText("Выйти")).exists()) {
            $(byText("Выйти")).click(); // Выход из системы
        }

// После выхода проверяем, что снова видна кнопка "Войти"
        $(byText("Войти")).shouldBe(visible);
}
}