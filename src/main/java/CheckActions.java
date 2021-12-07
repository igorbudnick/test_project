import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckActions{

    public void checkMailruPage() throws Exception {

        Thread.sleep(3000);
        try {
            $("#mailbox").shouldBe(visible);
            System.out.println("Home page is open");
        } catch (Error e) {
            throw new Exception("Page not found");
        }
    }

    public void checkEmailPage() throws Exception {

        Thread.sleep(3000);
        try {
            $("div[class='application-mail']").shouldBe(visible);
            System.out.println("Email page is open");
        } catch (Error e) {
            throw new Exception("Email not found");
        }
    }
}