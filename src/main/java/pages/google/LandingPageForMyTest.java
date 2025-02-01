package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageForMyTest {

    public WebDriver driver;
    public final WebElement sportButton;
    public final WebElement registerButton;



    public LandingPageForMyTest(WebDriver driver) {

        this.driver = driver;
        this.sportButton = driver.findElement(By.xpath("//a[@class='sc-f116bf72-4 eqTiTw'][normalize-space()='Sport']"));
        this.registerButton = driver.findElement(By.xpath("//button[@aria-label= 'Register']"));

    }

    public void clickOnSportButton() {
        sportButton.click();
    }
    public void clickOnRegisterButton() {
        registerButton.click();
    }

}
