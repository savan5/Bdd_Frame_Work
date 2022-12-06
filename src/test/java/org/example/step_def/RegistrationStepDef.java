package org.example.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegistrationStepDef extends DriverManager {
    RegistrationPage registrationPage = new RegistrationPage();
    @When("^I enter firstname \"([^\"]*)\"$")
    public void i_enter_firstname(String firstName) throws Throwable {
     registrationPage.enterFirstName(firstName);
    }

    @When("^I enter last name \"([^\"]*)\"$")
    public void i_enter_last_name(String lastName) throws Throwable {
     registrationPage.enterLastName(lastName);
    }

    @When("^I enter valid email on registration page \"([^\"]*)\"$")
    public void i_enter_valid_email_on_registration_page(String email) throws Throwable {
     registrationPage.enterEmail(email);
    }

    @When("^I enter password on registration page \"([^\"]*)\"$")
    public void i_enter_password_on_registration_page(String password) throws Throwable {
        registrationPage.enterPassword(password);
    }

    @When("^I confirm password on registration page \"([^\"]*)\"$")
    public void i_confirm_password_on_registration_page(String confirmPassword) throws Throwable {
     registrationPage.enterconfirmPassword(confirmPassword);
    }

    @When("^I click on register button on registration page$")
    public void i_click_on_register_button_on_registration_page() throws Throwable {
    registrationPage.clickRegisterButton();
    }

    @Then("^I should see \"([^\"]*)\" on registration page$")
    public void i_should_see_on_registration_page(String successRegistrationText) throws Throwable {
    registrationPage.visibleSuccesfullregisterText();
    }

    @Then("^I should see logout button displayed$")
    public void i_should_see_logout_button_displayed() throws Throwable {
      boolean visibleLogoutButton = registrationPage.visibleLogoutButton();
      assertThat(visibleLogoutButton ,is(true));
    }

    @Then("^I should see text \"([^\"]*)\" in URL$")
    public void i_should_see_text_in_URL(String linktext) throws Throwable {
    String url = getUrl();
        System.out.println(url);
        assertThat(url, containsString(linktext));
    }

}
