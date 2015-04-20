package pagest;

import models.TestPlan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Валерія on 19.04.2015.
 */
public class CreateTestPlanPage {
    private WebDriver driver;
    private static final By testPlanName =(By.name("testplan_name"));
    private static final By descriptionField = By.xpath("/html/body");
    private static final By active= By.name("active");
    private static final By isPublic=By.name("is_public");
    private static final By doCreate=By.name("is_create");

    public  CreateTestPlanPage  (WebDriver driver) {
        this.driver = driver;
    }

 public void creatTestPlan (TestPlan testPlan){
     driver.findElement(testPlanName).clear();
     driver.findElement(testPlanName).sendKeys(testPlan.title);
     driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_contents_notes']/iframe")));
     driver.findElement(descriptionField).sendKeys(testPlan.description);
     driver.findElement(active).click();
     driver.findElement(isPublic).click();
     driver.findElement(doCreate).click();
 }



}
