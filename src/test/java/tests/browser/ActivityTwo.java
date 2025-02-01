package tests.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActivityTwo{

    private final WebDriver driver;
    public final WebElement signInButtonGoogle;


    public ActivityTwo(WebDriver driver) {
        this.driver = driver;
        this.signInButtonGoogle = driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
    }

    public void clickOnSignInButtonGoogle(){
        signInButtonGoogle.click();
    }
}
