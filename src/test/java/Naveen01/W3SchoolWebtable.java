package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class W3SchoolWebtable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://w3schools.com/html/html_tables.asp");
        int size = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        System.out.println("Total Rows is " + (size - 1));

        //List<WebElement> names = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        List<WebElement> names = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr//td"));
        for (WebElement e : names) {
            System.out.println(e.getText());
        }
        driver.quit();
    }
}
