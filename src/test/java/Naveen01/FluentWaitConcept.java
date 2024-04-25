package Naveen01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitConcept {
    public static void main(String[] args) {
        /**
         * wait is the interface and until method is the abstract method in that interface
         * Fluent wait is the class which is implmemnting the wait interface
         * the is overridden in this class
         */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");

    }
}
