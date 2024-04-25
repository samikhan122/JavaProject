package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TotalImages {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        List<WebElement> imageList = driver.findElements(By.tagName("img"));
        System.out.println("Total images " + imageList.size());

//        for (WebElement e : imageList) {
//            String altValue = e.getAttribute("alt");
//            String srcValue = e.getAttribute("src");
//
//            System.out.println(altValue + " == " + srcValue);
        By links = By.tagName("alt");
        By images = By.tagName("src");
        System.out.println("total links = " + getElementsTextList(links));
        System.out.println("total Images = " + getElementsTextList(images));

        ArrayList<String> ele = getElementAsAttribute(images, "alt");
        System.out.println(ele);


        ArrayList<String> eleText = getElementsTextList(links);
        System.out.println(eleText);

        Thread.sleep(2000);
        driver.quit();
    }


    public static List<WebElement> getElements(By locator) {
        return driver.findElements(locator);

    }

    public static int getElementsCount(By locator) {
        return getElements(locator).size();
    }

    public static ArrayList<String> getElementsTextList(By locator) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleTextList = new ArrayList<>(); // physical capacity = 0;
        for (WebElement e : eleList) {
            String txt = e.getText();
            if (txt.length() != 0) {
                eleTextList.add(txt);

            }


        }
        return eleTextList;
    }

    public static ArrayList<String> getElementAsAttribute(By locator, String attName) {
        List<WebElement> eleList = getElements(locator);
        ArrayList<String> eleAttrList = new ArrayList<>();


        for (WebElement e : eleList) {
            String attvalue = e.getAttribute(attName);
            if (attvalue.length() != 0) {
                eleAttrList.add(attvalue);
            }
        }
        return eleAttrList;
    }
}

