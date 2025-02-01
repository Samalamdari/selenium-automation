package stepdefinations_bbc;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.google.LandingPageForMyTest;
import tests.browser.Base;
import utils.WaitUtils;

public class NavigateToBbcPageSteps extends BaseTest {

    LandingPageForMyTest landingPageForMyTest;

    @Before
    public void setup() {
        super.setup();
        this.landingPageForMyTest = new LandingPageForMyTest(driver);
    }

    @Given("I am on the bbc web page")
    public void i_am_on_the_bbc_web_page() {
//        Assert.assertEquals("failed", "https://www.bbc.com/", driver.getCurrentUrl());
        System.out.println(" print first step: ");
    }

    @When("I will click on the sport button")
    public void i_will_click_on_the_sport_button() throws InterruptedException {
        System.out.println(" no 1 ");
        WaitUtils.applyWait(driver, landingPageForMyTest.sportButton, WaitStrategy.VISIBLE);
        System.out.println(" no 2 ");
        WaitUtils.applyWait(driver, landingPageForMyTest.sportButton, WaitStrategy.CLICKABLE);
        System.out.println(" no 3 ");
        Thread.sleep(3000);
        landingPageForMyTest.clickOnSportButton();
        Thread.sleep(3000);
        System.out.println(" no 4 ");
    }

    @Then("I should see the sport page")
    public void i_should_see_the_sport_page() throws InterruptedException {
    Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

}
