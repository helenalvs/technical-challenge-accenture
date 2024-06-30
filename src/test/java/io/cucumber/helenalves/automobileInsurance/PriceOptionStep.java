package io.cucumber.helenalves.automobileInsurance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cumcumber.helenalves.CommandProcessSelenium;
import io.cumcumber.helenalves.pageObject.PriceOptionPage;
import org.openqa.selenium.WebDriver;

public class PriceOptionStep {

    private final WebDriver browser = CommandProcessSelenium.getBrowser();
    private final PriceOptionPage priceOptionPage = new PriceOptionPage(browser);

    @Given("I select the price option {string}")
    public void selectPriceOption(String price) {
        priceOptionPage.selectPriceOption(price);
    }

    @Then("Finish price step")
    public void finishPriceStep() throws InterruptedException {
        priceOptionPage.finishPriceStep();
    }
}