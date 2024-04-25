package ClassLectures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static ClassLectures.SelectDropDownOptions.doSelectByValue;

public class SelectDropDownAllOptions {


    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/30-day-free-trial/");
        By dropDown = By.xpath("//select[@id='Form_getForm_Country']");


        Thread.sleep(2000);
        driver.quit();


    }

    public static void doSelectDropDownValue(By locator, String value) {
        WebElement selectOptions = driver.findElement(locator);
        //doSelectByValue(selectOptions, "Togo");
        Select sc = new Select(selectOptions);

        List<WebElement> countries = sc.getOptions();

        System.out.println(sc.getOptions().size());
        for (WebElement e : countries) {
            String text = e.getText();
            System.out.println(text);
            if (text.equals(value)) {
                e.click();
                break;
            }
            //time complexity of the for loop (O N)
            // System.out.println(e.getText());

        }
    }
}

