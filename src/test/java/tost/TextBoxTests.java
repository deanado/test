package tost;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 5000;
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("parasha");
        $("#userEmail").setValue("umka@mail.ru");
        $("#currentAddress").setValue("jopa");
        $("#permanentAddress").setValue("popa");
        $("#submit").click();

        $("#output #name").shouldHave(text("parasha"));
        $("#output #email").shouldHave(text("umka@mail.ru"));
        $("#output #currentAddress").shouldHave(text("jopa"));
        $("#output #permanentAddress").shouldHave(text("popa"));

    }
}