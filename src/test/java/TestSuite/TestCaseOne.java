package TestSuite;

import models.TestPlan;
import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagest.CreateTestPlanPage;
import pagest.HomePage;
import pagest.LoginPage;
import pagest.ManagementTopicPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Валерія on 20.04.2015.
 */
public class TestCaseOne {
    private WebDriver driver;
    @BeforeTest
    public void userLogin() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(new User());
    }
    @Test
    public void TestOne() {
        HomePage homepage = new HomePage(driver);

        ManagementTopicPage managementTopicPage = homepage.openManagmentTopic();
        ManagementTopicPage editPage = managementTopicPage.createTestPlan();

        TestPlan testPlan = new TestPlan();

        Assert.assertTrue(managementTopicPage.TestPlanHere(testPlan));
        deleteTestPlan(testPlan);

    }
    @AfterTest
    public void deleteTestPlan(TestPlan testPlan) {
        ManagementTopicPage managementTopicPage = new ManagementTopicPage(driver);
        managementTopicPage.deleteTestPlan(testPlan);
    }
    public void shutEnv() {
        //deleteTestPlan(testPlan);
        logout();
}

    private void logout() {
        HomePage homePage = new HomePage(driver);
        homePage.logout();
    }
    }

