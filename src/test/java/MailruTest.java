import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class MailruTest{

    @Before
    public void start() {
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 15000;
        open("https://mail.ru/");
    }

    @Test
    public void test() throws Exception {
        Thread.sleep(3000);
    }
}