package io.cucumber.helenalves.automobileInsurance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cumcumber.helenalves.CommandProcessSelenium;
import io.cumcumber.helenalves.pageObject.SendQuotePage;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SendQuoteStep {

    private final WebDriver browser = CommandProcessSelenium.getBrowser();
    private final SendQuotePage sendQuotePage = new SendQuotePage(browser);

    @Given("that I enter the E-mail: {string}")
    public void enterEmail(String email) {
        sendQuotePage.enterEmail(email);
    }

    @Given("I fill in the Phone field: {string}")
    public void fillPhone(String phone) {
        sendQuotePage.fillPhone(phone);
    }

    @Given("I fill in the Username field: {string}")
    public void fillUsername(String username) {
        sendQuotePage.fillUsername(username);
    }

    @Given("I fill in the Password field: {string}")
    public void fillPassword(String password) {
        sendQuotePage.fillPassword(password);
    }

    @Given("I confirm the Password field: {string}")
    public void confirmPassword(String confirmPassword) {
        sendQuotePage.confirmPassword(confirmPassword);
    }

    @Then("I should click Send")
    public void clickSend() {
        sendQuotePage.clickSend();
    }

    @Then("verify the message: {string}")
    public void verifyMessage(String expectedMessage) throws InterruptedException {
        Thread.sleep(10000);
        assertEquals(sendQuotePage.getConfirmationMessage(), expectedMessage);
        CommandProcessSelenium.close();
    }
}