package tests.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FilterOutputStream;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");
        System.out.println("print the title of website: " + driver.getTitle());
        System.out.println("print the url of website: " + driver.getCurrentUrl());

        By aboutButton = By.xpath("//a[text() = 'About']");
        WebElement aboutButtonElement = driver.findElement(aboutButton);
        Thread.sleep(2000);
        aboutButtonElement.click();

        By textOnAboutPage = By.xpath("//h1[@class = 'modules-lib__mission-statement__headline glue-headline glue-headline--fluid-2']");
        WebElement texteMessage = driver.findElement(textOnAboutPage);
        Thread.sleep(2000);
        System.out.println(texteMessage.getText());

        By commitments = By.xpath("//a[@data-g-action = 'commitments']");
        WebElement commitmentsElement = driver.findElement(commitments);
        Thread.sleep(2000);
        commitmentsElement.click();

        By viewLocator = By.xpath("//a[@aria-label= 'View all reports']");
        WebElement viewElement = driver.findElement(viewLocator);
        Thread.sleep(2000);
        viewElement.click();

        Select select = new Select(driver.findElement(By.id("type-filter")));
        Thread.sleep(2000);
        select.selectByVisibleText("Diversity");
        Thread.sleep(2000);
        select.selectByValue("economy");
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);






//        driver.close();
//        driver.quit();


    }
}
