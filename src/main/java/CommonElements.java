import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CommonElements {

    public static SelenideElement

            mailruPage = $("#mailbox"),
            inputEmail = $("input[name='login']"),
            buttonEnterPassword = $("button[class='button svelte-1tib0qz'"),
            inputPassword = $("input[name='password']"),
            buttonEnter = $("button[class='second-button svelte-1tib0qz'"),
            writeEmail = $("div[class='sidebar__compose-btn-box']"),
            emailPage = $("div[class='application-mail']");
}
