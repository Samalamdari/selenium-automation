package tests.browser;


import enums.WaitStrategy;
import org.testng.annotations.Test;
import pages.google.LandingPageForMyTest;

import static config.DriverFactory.driver;

//public class NavigateToGoogleForMyTest extends Base {

//    @Test
//    public void NavigateToAboutPageTestOne() {
//        LandingPageForMyTest landingPageForMyTest = new LandingPageForMyTest(driver);
//        WaitUtils.globalWait();
//        WaitUtils.applyWait(driver, landingPageForMyTest.aboutButton, WaitStrategy.CLICKABLE);
//        landingPageForMyTest.clickOnAboutButton();
//        WaitUtils.globalWait();
//    }

//    @Test
//    public void NavigateToAboutTwoPageTestProducts() {
//        LandingPageForMyTest landingPageForMyTest = new LandingPageForMyTest(driver);
//        WaitUtils.globalWait();
//        WaitUtils.applyWait(driver, landingPageForMyTest.productsButton, WaitStrategy.CLICKABLE);
//        landingPageForMyTest.clickOnProductsButton();
//        WaitUtils.globalWait();
//    }
//}
