package Naveen01;

import org.openqa.selenium.WebDriver;

public class DisplayedElementClickSendKeys {
    public static void main(String[] args) throws Exception {
        WebDriver driver = null;
        BrowserUtils brs = new BrowserUtils(driver);
        brs.launchURL("https://classic.freecrm.com/register/");

    }
}
