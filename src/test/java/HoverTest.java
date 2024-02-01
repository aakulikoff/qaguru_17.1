import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HoverTest {
    @Test
    void homework(){
        baseUrl = "https://github.com";
        SelenideElement page = $("#hero-section-brand-heading");

        open(baseUrl);
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        page.shouldHave(text("The AI-powered"));
    }
}
