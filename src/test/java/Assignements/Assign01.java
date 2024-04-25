package Assignements;

import Naveen01.BrowserUtils;
import Naveen01.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Assign01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        // ElementUtil et = new ElementUtil(driver);
        List<WebElement> options = driver.findElements(By.xpath("//div[@class='list-group']//a"));
        for (WebElement e : options) {
            String value = e.getText();
            System.out.println(value);
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
