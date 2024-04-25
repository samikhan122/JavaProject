package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OpenCartNaveen {

    public static void main(String[] args) throws Exception {
        WebDriver driver = null;
        BrowserUtils brow = new BrowserUtils(driver);
        driver = brow.launchBrowser("chrome");
        brow.LaunchNaveenSite();
        ElementUtil etl = new ElementUtil(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        By myAccount = By.xpath("//a[@title='My Account']");
        By registerButton = By.xpath("//a[contains(text(),'Register')]");
        By firstName = By.xpath("//input[@name='firstname']");

        etl.getElementMethod(myAccount).click();
        etl.getElementMethod(registerButton).click();


        etl.sendKeys(firstName, "LoruBasheer");
        Thread.sleep(2000);
        brow.quitBrowser();

    }
}
