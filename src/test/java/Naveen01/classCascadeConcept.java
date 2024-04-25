package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classCascadeConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.hubspot.com/login");
        driver.findElement(By.cssSelector("input.private-form__control")).sendKeys("test");
        Thread.sleep(2000);
        driver.quit();
    }
}
