package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Naveen01.LocatorsConcept.driver;

public class FindElementAllLinksTest {
    public static void main(String[] args) throws Exception {
        WebDriver driver = null;
        BrowserUtils brs = new BrowserUtils(null);
        driver = brs.launchBrowser("chrome");
        brs.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        List<WebElement> allLink = driver.findElements(By.tagName("a"));
        for (WebElement e : allLink) {
            String links = e.getText();
            if (!links.isEmpty()) {
                System.out.println(links);
            }
        }
        brs.quitBrowser();


    }
}
