package pagest;

import models.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Валерія on 20.04.2015.
 */
public class TestCaseEditPage {
    private WebDriver driver;

    private static final By nameField = By.id("name");
    private static final By saveButton = By.name("add_testsuite_button");

    public TestCaseEditPage(WebDriver driver) {
        this.driver = driver;
    }

    public void editTestSuite(TestSuite testSuite) {
        driver.findElement(nameField).sendKeys(testSuite.name);
        driver.findElement(saveButton).click();
    }
}