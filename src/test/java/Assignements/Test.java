package Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");


        By options = By.xpath("//a[@class='list-group-item']");
        ArrayList<String> dropDown = getElementAsAttribute(options, "text");
        System.out.println(dropDown);
        Thread.sleep(2000);
        driver.quit();


    }

    public static List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }


    public static ArrayList<String> getElementAsAttribute(By locator, String attName) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleAttrList = new ArrayList<>();


        for (WebElement e : eleList) {
            String attvalue = e.getAttribute(attName);
            if (attvalue.length() != 0) {
                eleAttrList.add(attvalue);
            }
        }
        return eleAttrList;
    }


}
