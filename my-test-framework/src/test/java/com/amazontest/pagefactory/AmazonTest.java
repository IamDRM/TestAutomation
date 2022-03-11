package com.amazontest.pagefactory;

import com.amazontest.pages.Footer;
import com.amazontest.utils.PageUtils;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonTest extends Base {

    @Parameters({"footerColumnHeader", "footerNavLinks"})
    @Test
    public void printPageTitle(String footerColumnHeader, String footerNavLinks) throws InterruptedException {

        Footer footer = pagesFactory.getFooter();
        String[] footerNavLinkList = footerNavLinks.split(",");

        browser.navigateTo(BASE_URL);

        for (String footerNavLink : footerNavLinkList) {
            footer.scrollToColumn(footerColumnHeader);
            footer.openNavLinkInNewTab(footerNavLink);

            browser.switchToLastWindow();
            System.out.println(pageUtils.readPageTitle());

            browser.switchToMainWindow();
            System.out.println(pageUtils.readPageTitle());
        }

    }

}
