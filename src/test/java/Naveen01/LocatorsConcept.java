package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsConcept {

    //chrome dev tool: - the upper tabs within the dom
    // dom: document object model
    //create a webelement + perform an action on it (click,senkeys, getText, isDisplayed)
// By locator- page by locators or also called object repository.
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        String url = "https://naveenautomationlabs.com/opencart/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();

        driver.get(url);
        By email = By.id("input-email");
        By passWord = By.id("input-password");
        ElementUtil el = new ElementUtil(driver);
        el.sendKeys(email,"test123@gmail.com");
        el.sendKeys(passWord,"testing1234");

        //WebElement emailID = getElement(email);
        // WebElement passWordID = getElement(passWord);

//        sendKeys(email, "test123@gmail.com");
//        sendKeys(passWord, "testing1234");
        Thread.sleep(3000);
        driver.quit();
    }


    public static WebElement getElement(By element) {
        return driver.findElement(element);

    }

    public static void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }


}
