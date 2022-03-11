package com.amazontest.utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class Browser {

    private WebDriver driver;
    private String mainWindow;


    public Browser(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void switchToLastWindow() {
        mainWindow = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
            }
        }
    }

    public String getMainWindow() {
        if (mainWindow == null)
            mainWindow = driver.getWindowHandle();
        return mainWindow;
    }

    public void switchToMainWindow() {
        driver.switchTo().window(getMainWindow());
    }

    public void closeWindow() {
        driver.close();
    }

    public void close() {
        driver.quit();
    }


}
