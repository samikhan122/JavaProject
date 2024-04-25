package Naveen01;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitForAlerts {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        //Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(4000);
        driver.quit();

    }

    public static Alert waitForJavaScripAlert(int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.alertIsPresent());
    }

    public static String getAlertText(int timeout) {
        return waitForJavaScripAlert(timeout).getText();
    }
    public static void AcceptAlert(int timeout){
        waitForJavaScripAlert(timeout).accept();
    }
    public static void dismissAlert(int timeout,String value){
        waitForJavaScripAlert(timeout).sendKeys(value);
    }
}
