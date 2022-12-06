package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverManager {
    @FindBy(xpath = "//*[text()=\"Welcome to our store\"]")
    WebElement textOnHomePage;
    @FindBy(className = "ico-login")
    WebElement loginButtonOnHomePage;
    @FindBy(className = "ico-register")
    WebElement registrationButtonOnRegistrationPage;

    public String getTextFromHomePage(){
       return textOnHomePage.getText();
    }
    public void clickOnLoginButtonOnHomePage(){
        loginButtonOnHomePage.click();
    }
    public void clickOnRegistrationButtonOnHomePage(){
        registrationButtonOnRegistrationPage.click();
    }
}
