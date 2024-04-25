package Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class google3 {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //enter techlistic tutorials in search box
        driver.findElement(By.name("q")).sendKeys("naveen automation labs");
        List<WebElement> option = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
        System.out.println(option.size());

        for (WebElement e : option) {
            String textOptions = e.getText();
            System.out.println(textOptions);
            if (option.contains("naveen automationlabs")) {
                e.click();
                break;
            }
        }
        driver.quit();
    }
}
