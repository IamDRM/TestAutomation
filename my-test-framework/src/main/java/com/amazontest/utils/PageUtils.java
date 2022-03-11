package com.amazontest.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUtils {

    private WebDriver driver;

    public PageUtils(WebDriver driver) {
        this.driver = driver;
    }

    public String readPageTitle() {
        return driver.getTitle();
    }

    public void scrollIntoView(WebElement element) throws InterruptedException {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }
}
