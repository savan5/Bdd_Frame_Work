package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(xpath = "//*[text() = \"Welcome, Please Sign In!\"]")
    WebElement welcomeTextOnLoginPage;
    @FindBy(id = "Email")
    WebElement emailInputField;
    @FindBy(id = "Password")
    WebElement passwordInputField;
    @FindBy(xpath = "//*[@class=\"button-1 login-button\"]")
    WebElement loginButtonOnLoginPage;
    @FindBy(className = "ico-logout")
    WebElement logoutButton;
    public String getWelcomeTextFromLoginPage(){
       return welcomeTextOnLoginPage.getText();
    }
    public void enterEmail(String email){
        emailInputField.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordInputField.sendKeys(password);
    }
    public void clickOnLoginButtonOnLoginPage(){
        loginButtonOnLoginPage.click();
    }
    public boolean logoutButtonIsDisplayed(){
       return logoutButton.isDisplayed();
    }
}
