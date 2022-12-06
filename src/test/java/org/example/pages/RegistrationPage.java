package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends DriverManager {
    @FindBy(id = "FirstName")
    WebElement firstnameInputFieldOnRegistrationOage;
    @FindBy(id = "LastName")
    WebElement lastnameInputFieldOnRegistrationOage;
    @FindBy(id = "Email")
    WebElement emailInputFieldOnRegistrationOage;
    @FindBy(id = "Password")
    WebElement passwordInputFieldOnRegistrationOage;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordInputFieldOnRegistrationOage;
    @FindBy(id = "register-button")
    WebElement registerButtonOnRegistrationOage;
    @FindBy(xpath = "//*[@class='result']")
    WebElement registerSuccesfullText;
    @FindBy(className = "ico-logout")
    WebElement logoutButtonIs;

    public void enterFirstName(String firstName){
        firstnameInputFieldOnRegistrationOage.sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        lastnameInputFieldOnRegistrationOage.sendKeys(lastName);
    }
    public void enterEmail(String email){
       emailInputFieldOnRegistrationOage.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordInputFieldOnRegistrationOage.sendKeys(password);
    }
    public void enterconfirmPassword(String confirmPassword){
        confirmPasswordInputFieldOnRegistrationOage.sendKeys(confirmPassword);
    }
    public void clickRegisterButton(){
      registerButtonOnRegistrationOage.click();
    }
    public void visibleSuccesfullregisterText(){
      registerSuccesfullText.isDisplayed();
      registerSuccesfullText.getText();
    }
    public boolean visibleLogoutButton(){
       return logoutButtonIs.isDisplayed();
    }
}


