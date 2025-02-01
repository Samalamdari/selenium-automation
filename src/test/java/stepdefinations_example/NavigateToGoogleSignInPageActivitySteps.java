//package stepdefinations_example;
//
//import enums.WaitStrategy;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import tests.browser.ActivityTwo;
//import tests.browser.Base;
//import utils.WaitUtils;
//
//public class NavigateToGoogleSignInPageActivitySteps extends Base {
//
//    ActivityTwo runMyTest;
//
//    @Before
//    public void setup(){
//        super.setup();
//        this.runMyTest = new ActivityTwo(driver);
//    }
//    @Given("I am on the google dashbord page")
//    public void i_am_on_the_google_dashbord_page() {
//
//    }
//    @When("I click on signIn button")
//    public void i_click_on_signIn_button(){
//        WaitUtils.applyWait(driver, runMyTest.signInButtonGoogle, WaitStrategy.VISIBLE);
//        WaitUtils.applyWait(driver, runMyTest.signInButtonGoogle, WaitStrategy.CLICKABLE);
//        runMyTest.clickOnSignInButtonGoogle();
//    }
//
//    @Then("I should see your google account text on signIn page")
//    public void i_should_see_your_google_account_text_on_sign_in_page() {
//
//    }
//
//    @And("I should enter email")
//    public void i_should_enter_email() {
//
//    }
//
//    @And("I should click on next Button")
//    public void i_should_click_on_next_button() {
//
//    }
//
//    @And("I see text in signIn page")
//    public void i_see_text_in_sign_in_page() {
//
//    }
//
//    @After
//    public void tearDown(){
//        super.tearDown();
//    }
//
//}
