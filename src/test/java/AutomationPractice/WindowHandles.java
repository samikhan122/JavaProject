package AutomationPractice;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandles {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String parentWindowID = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[starts-with(@href,'https://www.linkedin.com')]")).click();
        driver.findElement(By.xpath("//a[starts-with(@href,'https://twitter.com/')]")).click();
        driver.findElement(By.xpath("//a[starts-with(@href,'https://www.youtube.com/')]")).click();
        driver.findElement(By.xpath("//a[starts-with(@href,'https://www.facebook.com/OrangeHRM/')]")).click();
        Set<String> handles = driver.getWindowHandles();
        List<String> hlist = new ArrayList<>(handles);
        if (switchToRightWindow("OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook", hlist)) {
            System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
        }
        Thread.sleep(3000);
        switchToParentWindow(parentWindowID);
        System.out.println("Parent Window ID " + parentWindowID);
        closeAllWindows(hlist,parentWindowID);
        Thread.sleep(3000);
        driver.quit();


    }

    public static void closeAllWindows(List<String> hlist, String parentWindowId) {
        for (String e : hlist) {
            if (!e.equals(parentWindowId)) {
                driver.switchTo().window(e).close();
            }
        }
    }

    public static void switchToParentWindow(String parentWindowID) {
        driver.switchTo().window(parentWindowID);
    }

    public static boolean switchToRightWindow(String windowTitle, List<String> hlist) {
        for (String e : hlist) {
            String title = driver.switchTo().window(e).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Found the right window");
                return true;
            }
        }
        return false;
    }
}
