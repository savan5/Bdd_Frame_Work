package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverManager {
    @FindBy(xpath = "//*[text() = \"Welcome, Please Sign In!\"]")
    WebElement welcomeTextOnLoginPage;
    public String getWelcomeTextFromLoginPage(){
       return welcomeTextOnLoginPage.getText();
    }
}
