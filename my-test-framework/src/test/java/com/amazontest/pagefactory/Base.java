package com.amazontest.pagefactory;

import base.Globals;
import com.amazontest.pagefactory.PagesFactory;
import com.amazontest.utils.Browser;
import com.amazontest.utils.PageUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Base extends Globals{

    public static final String BASE_URL = "https://www.amazon.in/";
    public WebDriver driver;

    @BeforeSuite
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        initGlobals(driver);
    }


    @AfterSuite
    public void cleanUp() {
        driver.quit();
    }


}
