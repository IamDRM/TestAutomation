package base;

import com.amazontest.pagefactory.PagesFactory;
import com.amazontest.utils.Browser;
import com.amazontest.utils.PageUtils;
import org.openqa.selenium.WebDriver;

public class Globals {

    public Browser browser;
    public PagesFactory pagesFactory;
    public PageUtils pageUtils;


    public void initGlobals(WebDriver driver) {
        browser = new Browser(driver);
        pagesFactory = new PagesFactory(driver);
        pageUtils = new PageUtils(driver);
    }

}
