package pages.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    public static WebDriver driver;

    @FindBy(xpath = "//a[text()= 'About']")
    public WebElement aboutButton;

    @FindBy(xpath = "//a[text()= 'Store']")
    public WebElement storeButton;

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnAboutButton() {
        this.aboutButton.click();
    }


}
