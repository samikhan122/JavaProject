package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTextFieldValue {
    public static void main(String[] args) throws Exception {
        WebDriver driver = null;
        BrowserUtils brs = new BrowserUtils(driver);
        brs.launchBrowser("chrome");
        brs.launchURL("https://classic.freecrm.com/register/");
        ElementUtil etl = new ElementUtil(brs.driver);
        WebElement name = etl.getElement(By.xpath("//input[@name='first_name']"));
        name.sendKeys("Ali Khan");
        String fName = etl.ElementGetAttribute(By.xpath("//input[@name='first_name']"),"value");
        System.out.println(fName);
        Thread.sleep(2000);
        brs.quitBrowser();
    }
}
