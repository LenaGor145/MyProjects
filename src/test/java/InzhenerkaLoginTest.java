
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InzhenerkaLoginTest {
    @Test
    void loginAndLogoutTest() {
         Configuration.browser = "chrome"; // Раскомментируй, если нужен Firefox

        // 1. Открыть страницу
        open("http://qa-stand-login.inzhenerka.tech/login");//open(url): открывает браузер.

        // 2. Вводим логин и пароль (данные берем из документации)
        $("#username").setValue("Armil");//.setValue("text"): вводит текст в поле.
        $(By.name("password")).setValue("12as345"); // .setValue("text"): вводит текст в поле.

        // 3. Нажимаем "Вход"
        $("button[type='submit']").click();

        // 4. ПРОВЕРКА (Assertion)
        // Мы ищем элемент body или заголовок, который содержит приветствие
        $("body").shouldHave(text("Привет, Armil"));//.shouldHave(text("...")): проверка, что элемент содержит текст.

        // 5. Выход из системы
        // Используем поиск по тексту "Выйти" — это надежнее, чем искать по классам стилей (.mb-3)
        $(byText("Выйти")).click();

        // 6. Проверка выхода (снова видна кнопка "Вход")
        $("button[type='submit']").shouldBe(visible);//.shouldBe(visible): проверка, что элемент виден.
    }
}


