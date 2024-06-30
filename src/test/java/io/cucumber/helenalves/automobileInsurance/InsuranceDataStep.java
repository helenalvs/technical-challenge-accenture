package io.cucumber.helenalves.automobileInsurance;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cumcumber.helenalves.CommandProcessSelenium;
import io.cumcumber.helenalves.pageObject.InsuranceDataPage;
import org.openqa.selenium.WebDriver;

public class InsuranceDataStep {
    
    private final WebDriver browser = CommandProcessSelenium.getBrowser();
    private final InsuranceDataPage insuranceDataPage = new InsuranceDataPage(browser);

    @Given("I enter First Name {string}")
    public void firstName(String firstName) {
        insuranceDataPage.enterFirstName(firstName);
    }

    @Given("I enter Last Name {string}")
    public void lastName(String lastName) {
        insuranceDataPage.enterLastName(lastName);
    }

    @Given("I fill in Date of Birth {string}")
    public void dateBirth(String birthDate) {
        insuranceDataPage.fillDateOfBirth(birthDate);
    }

    @Given("I specify Gender {string}")
    public void genderMale(String gender) {
        insuranceDataPage.selectGender(gender);
    }

    @Given("I fill in Street Address {string}")
    public void streetAddress(String streetAddress) {
        insuranceDataPage.fillStreetAddress(streetAddress);
    }

    @Given("I select Country: {string}")
    public void selectCountryBrazil(String country) {
        insuranceDataPage.selectCountry(country);
    }

    @Given("I fill in Zip Code {string}")
    public void zipCode(String zipCode) {
        insuranceDataPage.fillZipCode(zipCode);
    }

    @Given("I fill in City {string}")
    public void informCity(String city) {
        insuranceDataPage.fillCity(city);
    }

    @Given("I click on Occupation: {string}")
    public void clickOccupationEmployee(String occupation) {
        insuranceDataPage.selectOccupation(occupation);
    }

    @Given("I fill in hobbies")
    public void hobbies()  {
        insuranceDataPage.specifyHobbies();
    }

    @Given("I fill in Website {string}")
    public void informWebsite(String website) {
        insuranceDataPage.fillWebsite(website);
    }

    @Then("Finish insurance step")
    public void finishInsuranceStep() {
        insuranceDataPage.finishInsuranceStep();
    }

}