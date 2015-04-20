package pagest;

import models.TestPlan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Валерія on 19.04.2015.
 */
public class ManagementTopicPage {
    private WebDriver driver;
    private static final By testPlanCreate = By.name("create_testplan");
    private static final By deleteTestPlan= By.xpath("//iframe[@title='Rich text editor, details']");


    public ManagementTopicPage createTestPlan(){
        driver.findElement(testPlanCreate).click();
        return new ManagementTopicPage(driver);
    }
    public boolean TestPlanHere(TestPlan testPlan){
        return driver.findElement(By.linkText(testPlan.title)) != null;
    }

    public void deleteTestPlan(TestPlan testPlan) {
        driver.findElement(By.xpath("//img[contains(@onclick,'Test plan name')]")).click();
        driver.findElement(By.id("ext-gen20")).click();
    }


    public ManagementTopicPage(WebDriver driver) {this.driver = driver;}


}

