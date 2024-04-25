package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.net.URL;

public class OpenCartLoginTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = null;
        BrowserUtils brs = new BrowserUtils(driver);
        WebDriver browser = brs.launchBrowser("chrome");
        ElementUtil els = new ElementUtil(brs.driver);
        brs.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        By firstName = By.xpath("//input[@name='firstname']");
        By lastName = By.id("input-lastname");
        By email = By.id("input-email");
        By telephone = By.id("input-telephone");
        By password = By.name("password");
        By confirmPassword = By.name("confirm");
        By agree = By.xpath("//input[@type='checkbox' and @name='agree']");
        By continueBtn = By.xpath("//input[@value='Continue']");
        By accountCreation = By.xpath("//h1");


        els.sendKeys(firstName, els.getRandomFirstName());
        els.sendKeys(lastName, els.getRandomLastName());
        els.sendKeys(email, els.getRandomEmail());
        els.sendKeys(telephone, els.getPhoneNumber());
        els.sendKeys(password, "johnSmith0123");
        els.sendKeys(confirmPassword, "johnSmith0123");
        els.doCLick(agree);
        els.doCLick(continueBtn);
        String account = els.doGetElementText(accountCreation);

        Assert.assertEquals(account, "Your Account Has Been Created!");


        Thread.sleep(2000);
        browser.quit();

    }
}
