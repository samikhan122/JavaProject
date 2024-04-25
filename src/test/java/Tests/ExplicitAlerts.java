package Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ExplicitAlerts {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.dismiss();
        Thread.sleep(4000);
        driver.quit();


    }

    public static Alert waitForJsALert(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public static String getAlertText(int timeout) {
        return waitForJsALert(timeout).getText();
    }

    public static void acceptAlert(int timeout) {
        waitForJsALert(timeout).accept();
    }

    public static void dismissAlert(int timeout) {
        waitForJsALert(timeout).dismiss();
    }

    public static void alertSendKeys(int timeout, String value) {
        waitForJsALert(timeout).sendKeys(value);
    }

}
