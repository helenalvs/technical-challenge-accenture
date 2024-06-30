package io.cumcumber.helenalves;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandProcessSelenium {

    private static WebDriver browser;

    public static WebDriver getBrowser() {
        if (browser == null) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            browser = new ChromeDriver();
            browser.manage().window().maximize();
        }
        return browser;
    }

    public static void open(String url) {
        getBrowser().get(url);
    }

    public static void close() {
        if (browser != null) {
            browser.quit();
            browser = null;
        }
    }

}