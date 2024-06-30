package io.cumcumber.helenalves.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InsuranceDataPage {

    private final WebDriver browser;

    public InsuranceDataPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(id = "birthdate")
    WebElement birthDate;

    WebElement gender;

    @FindBy(id = "streetaddress")
    WebElement address;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "zipcode")
    WebElement zipCode;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "occupation")
    WebElement occupation;

    @FindBy(id = "website")
    WebElement website;

    @FindBy(id = "nextenterproductdata")
    WebElement finishButton;

    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void fillDateOfBirth(String birthDate) {
        this.birthDate.sendKeys(birthDate);
    }

    public void fillStreetAddress(String streetAddress) {
        this.address.sendKeys(streetAddress);
    }

    public void selectCountry(String country) {
        Select select = new Select(this.country);
        select.selectByValue(country);
    }

    public void fillZipCode(String zipCode) {
        this.zipCode.sendKeys(zipCode);
    }

    public void fillCity(String city) {
        this.city.sendKeys(city);
    }

    public void specifyHobbies() {
        browser.findElement(By.xpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]")).click();
    }

    public void selectOccupation(String occupation) {
        Select select = new Select(this.occupation);
        select.selectByValue(occupation);
    }

    public void fillWebsite(String website) {
        this.website.sendKeys(website);
    }

    public void finishInsuranceStep() {
        finishButton.click();
    }

    public void selectGender(String genderValue) {
        gender = browser.findElement(By.xpath("//label[input[@value='" + genderValue + "']]"));
        gender.click();
    }

}
