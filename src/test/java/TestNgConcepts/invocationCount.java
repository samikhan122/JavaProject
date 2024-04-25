package TestNgConcepts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class invocationCount {
    @BeforeTest
    public void createUser1(){
        System.out.println("BT- create user");
    }
    @Test(invocationCount = 5,priority = 2)//5 times the test will run
    public void createUser(){
        System.out.println("User created");
    }
    @Test(priority = 1)
    public void paymentTest(){
        System.out.println("Payment Test");
    }
    @AfterTest
    public void tearDown(){
        System.out.println("DB -- Closed");
    }
}
