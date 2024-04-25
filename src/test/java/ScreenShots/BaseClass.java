package ScreenShots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public abstract class BaseClass {
    static WebDriver driver;

    public void initializationMethod() {
        driver = new ChromeDriver();
        driver.get("https://www.guru99.com/listeners-selenium-webdriver.html");

    }

    public static void failed() throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("src/test/java/ScreenShotsPics/output.png"));
    }

}
