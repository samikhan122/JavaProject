package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class BrowserHandelingWindows {
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
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator(); // iterator is an interface
        String child1 = it.next();
        String child2 = it.next();
        String child3 = it.next();
        String child4 = it.next();

        System.out.println("Parent Window Id " + parent);
        System.out.println("Child 1  Window Id " + child1);
        System.out.println("Child 2  Window Id " + child2);
        System.out.println("Child 3  Window Id " + child3);
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(6000);
        System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());
        driver.switchTo().window(child2);
        driver.close();
        Thread.sleep(4000);
        driver.quit();

    }
}
