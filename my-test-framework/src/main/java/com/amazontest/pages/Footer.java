package com.amazontest.pages;

import com.amazontest.utils.PageUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Footer extends PageUtils{


    private WebDriver driver;

    @FindBy(css = ".navFooterLinkCol .navFooterColHead")
    private List<WebElement> lblColumnHeadings;

    @FindBy(css = ".nav_a")
    private List<WebElement> ctaNavLinks;

    public Footer(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private WebElement getWebElementAsPerVisibleText(List<WebElement> webElements, String textToSearch) {
        for (WebElement webElement: webElements) {
            if(webElement.getText().equals(textToSearch))
                return webElement;
        }
        return null;
    }

    public void scrollToColumn(String columnName) throws InterruptedException {
        WebElement lblColumnHeading = getWebElementAsPerVisibleText(lblColumnHeadings, columnName);
        scrollIntoView(lblColumnHeading);
    }

    public void openNavLinkInNewTab(String linkName) {
        WebElement ctaNavLink = getWebElementAsPerVisibleText(ctaNavLinks, linkName);
        String CTRL_ENTER = Keys.chord(Keys.CONTROL,Keys.ENTER);
        ctaNavLink.sendKeys(CTRL_ENTER);
    }


}
