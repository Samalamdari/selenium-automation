package stepdefinations_bbc;

import base.BaseTest;
import enums.WaitStrategy;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.google.LandingPageForMyTest;
import utils.WaitUtils;

public class NavigateToRegisterPageSteps extends BaseTest {


    LandingPageForMyTest landingPageForMyTest;

    @Before
    public void setup(){
        super.setup();
        this.landingPageForMyTest = new LandingPageForMyTest(driver);
    }

    @When("I will click on the register button")
    public void i_will_click_on_the_register_button() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println(" no 1 ");
        WaitUtils.applyWait(driver, landingPageForMyTest.registerButton, WaitStrategy.VISIBLE);
        Thread.sleep(3000);
        System.out.println(" no 2 ");
        WaitUtils.applyWait(driver, landingPageForMyTest.registerButton, WaitStrategy.CLICKABLE);
        Thread.sleep(3000);
        System.out.println(" no 3 ");
        landingPageForMyTest.clickOnRegisterButton();
        Thread.sleep(3000);
        System.out.println(" no 4 ");
    }

    @Then("I should see the register page")
    public void i_should_see_the_register_page() {
    }

    @After
    public void tearDown() {
        super.tearDown();
    }
}
