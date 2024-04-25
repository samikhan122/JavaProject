package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitTest {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/30-day-free-trial/");

        WebElement full_name = driver.findElement(By.id("Form_getForm_Name"));
        waitTill(full_name, 5);
        full_name.sendKeys("Ali Khan");

        Thread.sleep(4000);
        driver.quit();

    }

    public static WebElement waitTill(WebElement locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(locator));
        return ele;

    }
}
