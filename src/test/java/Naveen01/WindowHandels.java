package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandels {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        while (it.hasNext()) {
            String windowId = it.next();
            driver.switchTo().window(windowId);
            System.out.println("Window url " + driver.getCurrentUrl());
            if (!parent.equals(windowId)) {
                driver.close();
            }
            //driver.close();
            Thread.sleep(5000);
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
