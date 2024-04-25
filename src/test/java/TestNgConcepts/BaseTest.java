package TestNgConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;


    @Parameters({"url", "browser", "headless"})

    @BeforeTest
    public void setUp(@Optional("true")String url, String browserName, boolean headless) throws Exception {
        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                ChromeOptions co = new ChromeOptions();
                if (headless) {
                    co.addArguments("--headless");
                }
                driver = new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Pass the right browser");
                throw new Exception("Browser not found");
        }
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

