package pages.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    public WebDriver driver;

    // Locator for the sign-in button
    public final WebElement signIn;

    // Constructor to initialize the WebDriver
    public DashboardPage (WebDriver driver) {
       this.driver = driver;
       // Manually locating the element
        this.signIn = driver.findElement(By.xpath("//span[text() = 'Hello, sign in']"));
    }

    // Action to click on the sign-in button
    public void clickOnSignInButton() {
        signIn.click();
    }


}
