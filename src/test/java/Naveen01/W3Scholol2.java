package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class W3Scholol2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://w3schools.com/html/html_tables.asp");
        int count = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr//th")).size();
        System.out.println(count);

        for (int i = 0; i <= count; i++) {
            List<WebElement> colData = driver.findElements(By.xpath("//table[@id='customers']//tr/td[" + i + "]"));
            for (WebElement e : colData) {
                System.out.println(e.getText());
            }
        }

        driver.quit();
    }
}
