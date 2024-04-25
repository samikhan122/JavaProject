package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;


public class RelativeLocator01 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.aqi.in/us/dashboard/albania/tirane/tirane");
        WebElement ele = driver.findElement(By.linkText("Tirane, Albania"));
        String leftRank = driver.findElement(RelativeLocator.with(By.tagName("div")).toLeftOf(ele)).getText();
        System.out.println(leftRank);
        Thread.sleep(4000);
        driver.quit();
    }
}
