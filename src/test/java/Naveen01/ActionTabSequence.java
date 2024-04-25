package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTabSequence {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        Actions act = new Actions(driver);
        act.sendKeys(firstName, "loru").sendKeys(Keys.TAB).pause(500)
                .sendKeys(lastName, "basheer").sendKeys(Keys.TAB).pause(200).sendKeys("Lorubasheer@gmail.com").build().perform();
    }
}
