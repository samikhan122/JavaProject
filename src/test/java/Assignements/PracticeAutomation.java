package Assignements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PracticeAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.automationtesting.in/");
        List<WebElement> sliders = driver.findElements(By.xpath("//a[@class='woocommerce-LoopProduct-link']//img"));
        System.out.println(sliders.size());
        if(sliders.size() == 3){
            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
        }
        driver.quit();
    }
}
