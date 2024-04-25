package Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class google2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //open google
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //enter techlistic tutorials in search box
        driver.findElement(By.name("q")).sendKeys("selenium tutorial techlistic");

        //wait for suggestions
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbtc")));

        WebElement list=driver.findElement(By.className("sbtc"));
        List<WebElement> rows=list.findElements(By.tagName("li"));

        for(WebElement elem:rows) {
            System.out.println(elem.getText());
        }
    }
}

