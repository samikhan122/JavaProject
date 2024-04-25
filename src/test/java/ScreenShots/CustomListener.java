package ScreenShots;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

import java.io.IOException;

@Listeners(CustomListener.class)
public class CustomListener extends BaseClass implements ITestListener {

    @Override
    public  void onTestFailure(ITestResult result){
        System.out.println("Test Failed");
        try {
            failed();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

