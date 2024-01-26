import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.google.com/");
        $(byName("q")).setValue("selenide").pressEnter();
//        $(".main").shouldHave(text("https://ru.selenide.org"));
        $("[id=main]").shouldHave(text("https://ru.selenide.org"));

    }



}
