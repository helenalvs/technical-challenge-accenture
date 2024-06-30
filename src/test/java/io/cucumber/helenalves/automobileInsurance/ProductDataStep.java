package io.cucumber.helenalves.automobileInsurance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cumcumber.helenalves.CommandProcessSelenium;
import io.cumcumber.helenalves.pageObject.ProductDataPage;
import org.openqa.selenium.WebDriver;

public class ProductDataStep {

    private final WebDriver browser = CommandProcessSelenium.getBrowser();
    private final ProductDataPage productDataPage = new ProductDataPage(browser);

    @Given("I enter Start Date {string}")
    public void startDate(String date) {
        productDataPage.enterStartDate(date);
    }

    @Given("I click on Insurance Sum [$] {string}")
    public void insuranceSum(String value) {
        productDataPage.selectInsuranceSum(value);
    }

    @Given("I click on Merit Rating: {string}")
    public void ratingSuperBonus(String rating) {
        productDataPage.selectMeritRating(rating);
    }

    @Given("I click on Damage Insurance: {string}")
    public void damageInsurance(String damage) {
        productDataPage.selectDamageInsurance(damage);
    }

    @Given("I specify Optional Products: Euro Protection")
    public void optionalProducts() {
        productDataPage.selectOptionalProducts();
    }

    @Given("I click on Courtesy Car: {string}")
    public void courtesyCar(String courtesyCar) {
        productDataPage.selectCourtesyCar(courtesyCar);
    }

    @Then("Finish product step")
    public void finishProductStep() {
        productDataPage.finishProductStep();
    }

}