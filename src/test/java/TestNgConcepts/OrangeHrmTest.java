package TestNgConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHrmTest extends BaseTest {

    @Test(priority = 1)
    public void titleTest() {
       // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        Assert.assertTrue(url.contains("orangehrmlive"));

    }


        @Test(priority = 2)
    public void UrlTestFromOrangeHrm() {
        String url = driver.getCurrentUrl();
        System.out.println(url);

        String title = driver.getTitle();
        System.out.println(title);
        //Assert.assertEquals(title, "OrangeHRM", "Title is not a match");
//        Assert.assertEquals(title, "OrangeHRM", "Title is not a match");



    }


}
