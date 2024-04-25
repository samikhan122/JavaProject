package Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeAutomation2 {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        List<WebElement> amounts = driver.findElements(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
        if (amounts.contains("500.00")) {

        }


    }
}
