package file_web;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTesting {

    public static LoginPage loginPage;
    private static WebDriver driver;
    @BeforeClass
    private void setup(){

        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginepage"));
    }
    @Test
    private void loginTest() {
        loginPage.clickLoginBtn();
    }
    @AfterTest
    private void close() {
        driver.close();
    }
}

