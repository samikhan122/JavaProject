package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementDisplayed {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        By f1 = By.xpath(" //img[@class='img-responsive']");

//        if (isElementDisplayed(f1))
//            System.out.println("logo is displayed");

//        List<WebElement> logo = driver.findElements(By.xpath(" //img[@class='img-responsive']"));
//        if (logo.size() == 1) {
//            System.out.println("logo is displayed");
//        } else {
//            System.out.println("logo is not displayed");
//        }

        if(isElementDisplayed(f1)){
            System.out.println("pass");
        }else{
            System.out.println("failed");
        }
        Thread.sleep(2000);
        driver.quit();

    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static boolean isElementDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    public static boolean isElementExist(By locator) {
        if (getElements(locator).size() == 1) {
            return true;
        }
        return false;

    }

    public static List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

}
