package pagest;

import models.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Валерія on 20.04.2015.
 */
public class TestSuiteEditPage {
    WebDriver driver;
    private static final By nameSuit= By.id("name");
    private static final By addTestsuiteButton =By.id("add_testsuite_button");


    public TestSuiteEditPage(WebDriver driver) {
        this.driver = driver;
    }

    public void editTestSuite(TestSuite testSuite)
    {
        driver.findElement(nameSuit).sendKeys(testSuite.name);
        driver.findElement(addTestsuiteButton).click();
    }
}