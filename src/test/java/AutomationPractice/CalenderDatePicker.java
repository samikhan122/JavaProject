package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class CalenderDatePicker {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        launchUrl("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //by locators
        By radioButton = By.xpath("//input[@id='product_549']");
        By firstName = By.xpath("//input[@id='travname']");
        By lastName = By.xpath("//input[@id='travlastname']");
        By dobBox = By.xpath("//input[@id='dob']");
        By selectInitiateMonth = By.xpath("//select[@class='ui-datepicker-month']");
        By selectInitiateYear = By.xpath("//select[@class='ui-datepicker-year']");
        By doneBox = By.xpath("//button[contains(text(),'Done')]");
        By male = By.xpath("(//input[starts-with(@class,'input-radio')])[1]");
        By oneWay = By.xpath("//input[@id='traveltype_1']");





        //action methods
        clickOnElement(radioButton);
        sendKeys(firstName,"Loru");
        sendKeys(lastName,"basheer");

        clickOnElement(dobBox);
        Thread.sleep(6000);
        clickOnElement(selectInitiateMonth);
        selectClassByVisibleText(selectInitiateMonth,"Jun");
        Thread.sleep(6000);
        clickOnElement(selectInitiateYear);
        selectClassByVisibleText(selectInitiateYear,"1995");
        Thread.sleep(6000);
        clickOnElement(doneBox);
        clickOnElement(male);
        clickOnElement(oneWay);

        Thread.sleep(2000);

        quitBrowser();
    }

    public static void launchUrl(String url) {
        driver.get(url);
    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void sendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public static void clickOnElement(By locator) {
        driver.findElement(locator).click();
    }

    public static void quitBrowser() {
        driver.quit();
    }

    public static void selectClassByVisibleText(By locator, String value) {
        WebElement selectOptions = driver.findElement(locator);
        Select sc = new Select(selectOptions);

        List<WebElement> months = sc.getOptions();
        //System.out.println(sc.getOptions().size());

        for (WebElement e : months) {
            if (e.getText().equals(value)) {
                e.click();
                break;
            }
        }
    }

}
