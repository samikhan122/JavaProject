package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PollingTimeConcept {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        By twitter = By.xpath("//a[contains(@href,'twitter')]");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5),Duration.ofSeconds(2));
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(twitter));
        ele.click();
    }

}