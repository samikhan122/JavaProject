package Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google4 {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
        Thread.sleep(2000);
        driver.findElements(By.xpath("//a[@class='woocommerce-LoopProduct-link']//img"));

        Thread.sleep(2000);
        driver.quit();
    }
}
