package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WaitForWindow {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        if (wait.until(ExpectedConditions.numberOfWindowsToBe(2))) {
            Set<String> handles = driver.getWindowHandles();
            Iterator<String> it = handles.iterator();
            String parent = it.next();
            System.out.println("Parent Window ID " + parent);
            String childWindow = it.next();
            System.out.println("Child Window" + childWindow);

        }
    }
}
