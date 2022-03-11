package com.amazontest.pagefactory;

import com.amazontest.pages.Footer;
import org.openqa.selenium.WebDriver;

public class PagesFactory {

    WebDriver driver;
    Footer footer;

    public PagesFactory(WebDriver driver) {
        this.driver = driver;
    }

    public Footer getFooter() {
        footer = new Footer(driver);
        return footer;
    }
}
