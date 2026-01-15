import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {

    @Test
    void openGoogle() {
        open("https://www.google.com");
    }
}