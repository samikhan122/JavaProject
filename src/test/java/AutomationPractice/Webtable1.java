package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Webtable1 {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        String name = driver.findElement(By.xpath("//a[contains(text(),'Sun Pharma.')]")).getText();
        System.out.println(name);
        driver.quit();

    }
}
