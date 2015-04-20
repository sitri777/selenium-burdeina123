package pagest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Валерія on 19.04.2015.
 */
public class HomePage {
    private WebDriver driver;
    private static final By mgmtTopics = By.id("test_plan_mgmt_topics");
    private static final By logout = By.linkText("logout");
    private static final By testSuitManagementPage=By.xpath("//*[@id='testspecification_topics']/a[1]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ManagementTopicPage openManagmentTopic(){
        driver.switchTo().frame("mainframe").findElement(mgmtTopics).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return new ManagementTopicPage(driver);
    }
    public void logout() {
        driver.switchTo().defaultContent().switchTo().frame("titlebar").findElement(logout).click();
    }
    public  TestSuiteManagementPage openTestSuiteManagmentPage(){
        Frames.switchToMainFrame(driver);
        driver.findElement(testSuitManagementPage).click();
         return new TestSuiteManagementPage(driver);

    }

}

