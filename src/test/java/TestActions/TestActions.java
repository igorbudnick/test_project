package TestActions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class TestActions {


    public void loginEmail(String login, String password) throws Exception {
        try {
            $("input[name='login']").shouldBe(visible).sendKeys(login);
        } catch (Error e) {
            throw new Exception("Input email field not found");
        }
        try {
            $("button[class='button svelte-1tib0qz'").shouldBe(visible).click();
        } catch (Error e) {
            throw new Exception("Button 'Enter password' not found");
        }
        try {
            $("input[name='password']").shouldBe(visible).sendKeys(password);
        } catch (Error e) {
            throw new Exception("Button 'Enter password' not found");
        }
        try {
            $("button[class='second-button svelte-1tib0qz'").shouldBe(visible).click();
        } catch (Error e) {
            throw new Exception("Button 'Enter password' not found");
        }
    }
}
