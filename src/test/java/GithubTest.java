import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {

    @Test
    void successfulGitHubSearchTest1() {
        Selenide.open("https://github.com/");
        $(".header-search-button").click();
        $("#query-builder-test").val("Selenide").pressEnter();
        $(".repo-list").shouldHave(text("selenide/selenide"));
        $(byLinkText("selenide/selenide")).click();
    }

    @Test
    void successfulGitHubSearchTest2() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(byText("Soft assertions")).shouldBe(Condition.visible).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
