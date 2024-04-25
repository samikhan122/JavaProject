package ClassLectures;

import Naveen01.MyException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDownOptions {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/30-day-free-trial/");
        By selectOptions = By.xpath("//select[@id='Form_getForm_Country']");
        doSelectByValue(selectOptions, "Togo");


        Thread.sleep(2000);
        driver.quit();

    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doSelectByIndex(By locator, int index) {
        Select select = new Select(getElement(locator));
        select.selectByIndex(index);
    }

    public static void doSelectByValue(By locator, String value) {
        nullBlankCheck(value);
        Select select = new Select((getElement(locator)));
        select.selectByValue(value);
    }

    public static void doSelectByVisibleText(By locator, String value) {
        nullBlankCheck(value);
        Select select = new Select((getElement(locator)));
        select.selectByValue(value);
    }

    public static void nullBlankCheck(String value) {
        if (value == null || value.isEmpty()) {
            throw new MyException("Element is not present in the option ");
        }
    }
}
