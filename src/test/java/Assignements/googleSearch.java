package Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class googleSearch {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //By searchField = By.xpath()
        try {


            driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Naveen Automation Labs");
            //List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span]"));
            List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='pcTkSc']//div[@class='wM6W7d WggQGd']/span"));
            Thread.sleep(2000);
            System.out.println(suggestions.size());
        } catch (Exception e) {



            Thread.sleep(2000);
            driver.quit();
        }
    }
    public static void doSearch(By searchLocator, By searchSuggestion,String searchKey, String value) throws InterruptedException {
        driver.findElement(searchLocator).sendKeys(searchKey);
        Thread.sleep(3000);
        List<WebElement>suggestions = driver.findElements(searchSuggestion);
        System.out.println(suggestions.size());


        for (WebElement e : suggestions) {
            String text = e.getText();
            System.out.println(text);
            if (text.contains(value)) {
                e.click();
                break;
            }

        }

    }
}
