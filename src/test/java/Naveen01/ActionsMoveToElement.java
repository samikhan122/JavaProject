package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        By parent = By.xpath("//div[text()='Add-ons']");
        By child = By.xpath("//div[text()='You1st']");
        handleMenuSubMenu(parent, child);
        //Actions act = new Actions(driver);
        //act.moveToElement(parent).perform();
        //Thread.sleep(2000);
        //act.click(child);
        //Thread.sleep(4000);
        driver.quit();

    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void handleMenuSubMenu(By parentMenuLocator, By ChildLocator) throws InterruptedException {
        Actions act = new Actions(driver);
        act.moveToElement(getElement(parentMenuLocator)).perform();
        Thread.sleep(4000);
        getElement(ChildLocator).click();


    }
}
