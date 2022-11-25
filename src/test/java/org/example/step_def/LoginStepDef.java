package org.example.step_def;

import cucumber.api.java.en.Then;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.text.IsEqualIgnoringCase.equalToIgnoringCase;

public class LoginStepDef extends DriverManager {
    LoginPage loginPage = new LoginPage();
    @Then("^I shoud see \"([^\"]*)\" text on login page$")
    public void i_shoud_see_text_on_login_page(String expectedWelcomeTextOnLoginPage) throws Throwable {
      String actualWelcomeText = loginPage.getWelcomeTextFromLoginPage();
        System.out.println(actualWelcomeText);
        System.out.println(expectedWelcomeTextOnLoginPage);
      assertThat(actualWelcomeText, is(equalToIgnoringCase(expectedWelcomeTextOnLoginPage)));

    }
    @Then("^I shoud see \"([^\"]*)\" text in url$")
    public void i_shoud_see_text_in_url(String expectedUrlText) throws Throwable {
        String actualUrl = getUrl();
        System.out.println(actualUrl);
        assertThat(actualUrl, containsString(expectedUrlText));

    }

}
