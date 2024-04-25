package ClassLectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectDropDownWithSelectingDropDown {
   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/30-day-free-trial/");
        By dropDown = By.xpath("//select[@id='Form_getForm_Country']/option");
        doSelectValueFromDropDown(dropDown);
        Thread.sleep(2000);
        driver.quit();
    }

    public static void doSelectValueFromDropDown(By locator) {
        List<WebElement> findElements = driver.findElements(locator);
        for (WebElement e : findElements) {
            String text = e.getText();
            System.out.println(text);

        }

    }
}
