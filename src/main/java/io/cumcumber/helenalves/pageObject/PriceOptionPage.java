package io.cumcumber.helenalves.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceOptionPage {

    private final WebDriver browser;

    public PriceOptionPage(WebDriver browser) {
        this.browser = browser;
        PageFactory.initElements(browser, this);
    }

    WebElement priceOption;

    @FindBy(id = "nextsendquote")
    WebElement nextButton;


    public void finishPriceStep() throws InterruptedException {
        Thread.sleep(3000);
        nextButton.click();
    }

    public void selectPriceOption(String price) {
        priceOption = browser.findElement(By.xpath("//label[input[@id='" + price + "']]"));
        priceOption.click();
    }
}
