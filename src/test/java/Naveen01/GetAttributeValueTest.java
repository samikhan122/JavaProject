package Naveen01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetAttributeValueTest {
    static WebDriver driver;

    public static void main(String[] args) throws Exception {
        driver = null;
        BrowserUtils brs = new BrowserUtils(driver);

        driver = brs.launchBrowser("chrome");
        brs.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        //List<WebElement> allLinks =
        By firstNameAttribute = By.id("input-firstname");
        By registerLink = By.xpath("//div[@class='list-group']//child::a[contains(text(),'Register')]");
        String lastNameAttrubute = driver.findElement(By.id("input-lastname")).getAttribute("name");

        System.out.println(lastNameAttrubute);


        String f = ElementGetAttribute(firstNameAttribute, "placeholder");
        String register_hrf = ElementGetAttribute(registerLink, "href");
        System.out.println(register_hrf);
        System.out.println(f);
        driver.quit();
    }


    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static String ElementGetAttribute(By locator, String attrName) {
        return getElement(locator).getAttribute(attrName);
    }
}
