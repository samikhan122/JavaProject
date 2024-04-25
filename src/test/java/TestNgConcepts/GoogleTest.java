package TestNgConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class GoogleTest extends BaseTest{


    @Test(priority = 2)
    public void testTitle() throws InterruptedException {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Google", "Title is not matching");

    }

    @Test(priority = 3)
    public void imageTest() {
        boolean flag = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
        Assert.assertTrue(flag, "Image is not present");
    }

    @Test(priority = 1)
    public void urlTest() {
       // driver.get("https://google.com");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(url.contains("google"),"URL is not present for Google.com");
    }


}
