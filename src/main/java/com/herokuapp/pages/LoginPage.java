package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(id = "username")
    WebElement userNameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//i[contains(text(),'Login')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[text()=' Secure Area']")
    WebElement loginTextMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id='flash']")
    WebElement userNameErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id='flash']")
    WebElement passwordErrorMessage;

    public void enterUserName(String userName) {
        Reporter.log("Entered username " + userName + " in username field " + userNameField.toString());
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        Reporter.log("Entered password " + password + " in password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Clicked on login button " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getLoginTextMessage() {
        return getTextFromElement(loginTextMessage);
    }

    public String getUserNameErrorMessage() {
        return getTextFromElement(userNameErrorMessage);
    }

    public String getPasswordErrorMessage() {
        return getTextFromElement(passwordErrorMessage);
    }
}
