package TestNgConcepts;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.*;

public class OpenCartSessions {
    @BeforeSuite
    public void dbConnection() {
        System.out.println("DB Connection");
    }

    @BeforeTest
    public void createUser() {
        System.out.println("BT -- create User");
    }

    @BeforeClass
    public void launchBrowser() {
        System.out.println("Launch Browser");
    }

    @BeforeMethod
    public void login() {
        System.out.println("BC -- login to APP");
    }

    @Test
    public void titleTest() {
        System.out.println("Title Test");

    }

    @Test
    public void urlTest() {
        System.out.println("Url Test");
    }

    @Test
    public void headerTest() {
        System.out.println("Header Test");
    }

    @AfterMethod
    public void logout() {
        System.out.println("Logout");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("Close browser");
    }

    @AfterTest
    public void deleteUser() {
        System.out.println("Delete User");
    }

    @AfterSuite
    public void disconnectDB() {
        System.out.println("Disconnect Data Base");
    }
}
