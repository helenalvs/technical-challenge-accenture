package io.cumcumber.helenalves.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage {

    public ProductDataPage(WebDriver browser) {
        PageFactory.initElements(browser, this);
    }

    @FindBy(id = "startdate")
    WebElement startDate;

    @FindBy(id = "insurancesum")
    WebElement insuranceSumDropdown;

    @FindBy(id = "meritrating")
    WebElement meritRatingDropdown;

    @FindBy(id = "damageinsurance")
    WebElement damageInsuranceDropdown;

    @FindBy(xpath = "//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]")
    WebElement optionalProducts;

    @FindBy(id = "courtesycar")
    WebElement courtesyCarDropdown;

    @FindBy(id = "nextselectpriceoption")
    WebElement nextButton;

    public void enterStartDate(String date) {
        startDate.sendKeys(date);
    }

    public void selectInsuranceSum(String value) {
        Select select = new Select(insuranceSumDropdown);
        select.selectByValue(value);
    }

    public void selectMeritRating(String rating) {
        Select select = new Select(meritRatingDropdown);
        select.selectByValue(rating);
    }

    public void selectDamageInsurance(String damage) {
        Select select = new Select(damageInsuranceDropdown);
        select.selectByValue(damage);
    }

    public void selectOptionalProducts() {
        optionalProducts.click();
    }

    public void selectCourtesyCar(String car) {
        Select select = new Select(courtesyCarDropdown);
        select.selectByValue(car);
    }

    public void finishProductStep() {
        nextButton.click();
    }
}
