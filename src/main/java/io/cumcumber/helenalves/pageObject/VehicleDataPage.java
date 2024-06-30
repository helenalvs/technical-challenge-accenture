package io.cumcumber.helenalves.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class VehicleDataPage {

    public VehicleDataPage(WebDriver browser) {
        PageFactory.initElements(browser, this);
    }

    @FindBy(id = "nav_automobile")
    WebElement automobileTab;

    @FindBy(id = "make")
    WebElement makeDropdown;

    @FindBy(id = "engineperformance")
    WebElement enginePerformance;

    @FindBy(id = "dateofmanufacture")
    WebElement dateOfManufacture;

    @FindBy(id = "numberofseats")
    WebElement numberOfSeatsDropdown;

    @FindBy(id = "fuel")
    WebElement fuelTypeDropdown;

    @FindBy(id = "listprice")
    WebElement listPrice;

    @FindBy(id = "licenseplatenumber")
    WebElement licensePlateNumber;

    @FindBy(id = "annualmileage")
    WebElement annualMileage;

    @FindBy(id = "nextenterinsurantdata")
    WebElement nextButton;

    public void clickAutomobile() {
        automobileTab.click();
    }

    public void selectMake(String make) {
        Select select = new Select(makeDropdown);
        select.selectByValue(make);
    }

    public void fillEnginePerformance(String performance) {
        enginePerformance.sendKeys(performance);
    }

    public void fillDateOfManufacture(String date) {
        dateOfManufacture.sendKeys(date);
    }

    public void selectNumberOfSeats(String numberSeats) {
        Select select = new Select(numberOfSeatsDropdown);
        select.selectByValue(numberSeats);
    }

    public void selectFuelType(String fuel) {
        Select select = new Select(fuelTypeDropdown);
        select.selectByValue(fuel);
    }

    public void fillListPrice(String price) {
        listPrice.sendKeys(price);
    }

    public void fillLicensePlateNumber(String licensePlate) {
        licensePlateNumber.sendKeys(licensePlate);
    }

    public void fillAnnualMileage(String mileage) {
        annualMileage.sendKeys(mileage);
    }

    public void clickNext() {
        nextButton.click();
    }
}
