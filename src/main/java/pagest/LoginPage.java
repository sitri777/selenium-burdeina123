package pagest;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Валерія on 18.04.2015.
 */
public class LoginPage {
    private WebDriver driver;
    private static final String URL="http://demo.testlink.org/latest/login.php";
    private static final By LoginField = By.id("login");
    private static final By PassField = By.name("tl_password");
    private static final By loginButton = By.name("login_submit");


    public void login (User user) {
        driver.get(URL);
        driver.findElement(LoginField).clear();
        driver.findElement(LoginField).sendKeys(user.name);
        driver.findElement(PassField).clear();
        driver.findElement(PassField).sendKeys(user.password);
        driver.findElement(loginButton).click();
    }
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
}
