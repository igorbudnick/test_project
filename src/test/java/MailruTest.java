import TestActions.TestActions;
import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MailruTest {

    CheckActions checkActions = new CheckActions();
    TestActions testActions = new TestActions();

    @Before
    public void start() throws Exception {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        open(ProjectSettings.siteUrl);
        checkActions.checkMailruPage();
        testActions.loginEmail(ProjectSettings.login, ProjectSettings.password);
        checkActions.checkEmailPage();
    }

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(3000);
    }
}