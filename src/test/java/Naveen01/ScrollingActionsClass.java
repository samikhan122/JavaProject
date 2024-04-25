package Naveen01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScrollingActionsClass {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        //usually for scrolling we use javascript exector
        driver.get("https://www.bestbuy.com/");
        Thread.sleep(4000);
        Actions act = new Actions(driver);
        //act.sendKeys(Keys.PAGE_DOWN).perform();
        act.scrollToElement(driver.findElement(By.xpath("//li/a[text()='Lease to Own']")))
                .click().build().perform();


    }

    public static Alert waitForJsAlert(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void getAlertText(int timeout) {
        waitForJsAlert(timeout).accept();
    }

    public static void dismissAlert(int timeout) {
        waitForJsAlert(timeout).dismiss();
    }

    public static void alertSendKeys(int timeout, String value) {
        waitForJsAlert(timeout).sendKeys(value);
    }
}
