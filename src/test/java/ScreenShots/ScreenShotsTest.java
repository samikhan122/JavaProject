package ScreenShots;

import org.junit.After;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScreenShotsTest extends BaseClass {
    CustomListener cs;

    @BeforeMethod
    public void setUp() {
        initializationMethod();


    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            System.out.println("Test case has been failed");
            failed();
        }
        if(ITestResult.SKIP==result.getStatus()){
            failed();
            System.out.println("Test skipped and need revision");
        }

        driver.quit();
    }

    @Test
    public void takeScreenShotsTest() {
        Assert.assertEquals(false, true);

    }

    //itest result which will keep and information about the test case which we executed
    // we will capture some information from like this.
    //after method- will exexute after every test


}
