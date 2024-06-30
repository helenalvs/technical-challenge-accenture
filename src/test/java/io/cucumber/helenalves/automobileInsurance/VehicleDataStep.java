package io.cucumber.helenalves.automobileInsurance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cumcumber.helenalves.CommandProcessSelenium;
import io.cumcumber.helenalves.pageObject.VehicleDataPage;
import org.openqa.selenium.WebDriver;

public class VehicleDataStep {

    private final WebDriver browser = CommandProcessSelenium.getBrowser();
    private final VehicleDataPage vehicleDataPage = new VehicleDataPage(browser);

    @When("I access the Tricentis site: {string}")
    public void accessTricentisSite(String url) {
        CommandProcessSelenium.open(url);
    }

    @Given("I click on Automobile")
    public void clickAutomobile() {
        vehicleDataPage.clickAutomobile();
    }

    @Given("I select Make: {string}")
    public void selectMakeAudi(String car) {
        vehicleDataPage.selectMake(car);
    }

    @Given("I fill in the Engine Performance [kW]: {string}")
    public void fillEnginePerformance(String performance) {
        vehicleDataPage.fillEnginePerformance(performance);
    }

    @Given("I fill in the Date of Manufacture: {string}")
    public void fillDateOfManufacture(String date) {
        vehicleDataPage.fillDateOfManufacture(date);
    }

    @Given("I select Number of Seats: {string}")
    public void selectNumberOfSeats(String numberSeats) {
        vehicleDataPage.selectNumberOfSeats(numberSeats);
    }

    @Given("I select Fuel Type: {string}")
    public void selectFuelTypeElectricPower(String fuel) {
        vehicleDataPage.selectFuelType(fuel);
    }

    @Given("I fill in the List Price [$]: {string}")
    public void fillListPrice(String price) {
        vehicleDataPage.fillListPrice(price);
    }

    @Given("I fill in the License Plate Number: {string}")
    public void fillLicensePlateNumber(String licensePlate) {
        vehicleDataPage.fillLicensePlateNumber(licensePlate);
    }

    @Given("I fill in the Annual Mileage [mi]: {string}")
    public void fillAnnualMileage(String mileage) {
        vehicleDataPage.fillAnnualMileage(mileage);
    }

    @Then("Finish vehicle step")
    public void clickNext() {
        vehicleDataPage.clickNext();
    }
}