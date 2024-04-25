package Naveen01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtils {
    WebDriver driver;

    public BrowserUtils(WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver launchBrowser(String browserName) {
        System.out.println("browser Name : " + browserName);

        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
            case "ie":
                driver = new EdgeDriver();
            default:
                System.out.println("Pass the right browser");
                throw new MyException("Browser not found");
        }

        return driver;
    }

    public String LaunchNaveenSite() {
        return "https://naveenautomationlabs.com/opencart/index.php?route=account/register";
    }


    public String launchURL(String url) throws Exception {
        if (url == null) {
            throw new Exception("URl is null");
        }
        if (url.indexOf("http") == 0) {
            driver.get(url);
        } else {
            throw new Exception("url is not correct");
        }
        return url;
    }

    public String getPageURL() {
        return driver.getTitle();
    }

    public void closeBrowser() {
        driver.close();
    }

    public void quitBrowser() {
        driver.quit();
    }
}
