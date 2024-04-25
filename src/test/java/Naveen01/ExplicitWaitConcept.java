package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class ExplicitWaitConcept {
   public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.titleContains("nopCommerce"));
        //wait.until(ExpectedConditions.titleContains("OrangeHRM"));
//        String title = waitForTitleContains("OrangeHRM", 10);
//        System.out.println(title);
//        System.out.println(driver.getTitle());
        //Thread.sleep(4000);
        By eleAll = By.xpath("//ul[@class='top-menu notmobile']/li/a");
       // WebElement eleAll2 = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li/a"));
        List<WebElement> eleAll3 = driver.findElements(By.xpath("//ul[@class='top-menu notmobile']/li/a"));

        List<WebElement> vs = waitForElementsVisible(driver,eleAll3, 5);
        for (WebElement a : vs) {
            System.out.println(a.getText());
        }
        driver.quit();
    }


    public static WebElement getElement(By locator) {
        return driver.findElement(locator);

    }

    public static String waitForTitleContains(String title, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        try {
            wait.until(ExpectedConditions.titleContains(title));
            return driver.getTitle();
        } catch (TimeoutException e) {
            System.out.println("Title containing '" + title + "' not found within the timeout period.");
        } catch (Exception e) {
           System.out.println("An unexpected error occurred: " + e.getMessage());
        }

        return null;
    }

    public static String waitForTitleIs(String title, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (wait.until(ExpectedConditions.titleIs(title))) {
            return driver.getTitle();
        } else {
            System.out.println("Title not found");

        }

        return null;
    }

    public static String waitForUrlContains(String title, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (wait.until(ExpectedConditions.urlContains(title))) {
            return driver.getTitle();
        } else {
            System.out.println("Title not found");

        }

        return null;
    }

    public static List<WebElement> waitForElementsVisible(WebDriver driver,List<WebElement> locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfAllElements(locator));
    }
    public static void waitForElement( WebElement element) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
