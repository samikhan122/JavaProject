package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementEnabledAndSelected {
    public static void main(String[] args) throws Exception {
        WebDriver driver = null;
        BrowserUtils brs = new BrowserUtils(driver);
        brs.launchBrowser("chrome");
        brs.launchURL("https://classic.freecrm.com/register/");
        ElementUtil etl = new ElementUtil(brs.driver);
        WebElement name = etl.getElement(By.xpath("//input[@name='first_name']"));
        name.sendKeys("Ali Khan");
        By submitBox = By.xpath("//button[@name='submitButton']");
        boolean submit = etl.getElement(submitBox).isEnabled();
        System.out.println(submit);
        By checkBox = By.xpath("//input[@name='agreeTerms']");
        boolean checkBoxFlag = etl.getElement(checkBox).isSelected();
        System.out.println("CheckBox is " + checkBoxFlag);
        etl.getElement(checkBox).click();
        checkBoxFlag = etl.getElement(checkBox).isSelected();
        System.out.println("CheckBox After checking it is " + checkBoxFlag);
        Thread.sleep(2000);
        brs.quitBrowser();

    }
}
