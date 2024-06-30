package io.cumcumber.helenalves.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuotePage {

    public SendQuotePage(WebDriver browser) {
        PageFactory.initElements(browser, this);
    }

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmpassword")
    WebElement confirmPassword;

    @FindBy(id = "sendemail")
    WebElement sendButton;

    @FindBy(css = "body > div.sweet-alert.showSweetAlert.visible > h2")
    WebElement confirmationMessage;

    public void enterEmail(String emailText) {
        email.sendKeys(emailText);
    }

    public void fillPhone(String phoneText) {
        phone.sendKeys(phoneText);
    }

    public void fillUsername(String usernameText) {
        username.sendKeys(usernameText);
    }

    public void fillPassword(String passwordText) {
        password.sendKeys(passwordText);
    }

    public void confirmPassword(String confirmPasswordText) {
        confirmPassword.sendKeys(confirmPasswordText);
    }

    public void clickSend() {
        sendButton.click();
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }
}
