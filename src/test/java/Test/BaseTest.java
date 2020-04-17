package Test;

import Page.LoginPage;
import Page.MainPage;
import Page.OffersPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    public LoginPage loginPage;
    public MainPage mainPage;
    public OffersPage offersPage;
    public WebDriverWait wait;

    @BeforeMethod
    public void browserSetup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        wait = new WebDriverWait(driver, 4);

        loginPage = new LoginPage(driver);
        mainPage = new MainPage(driver);
        offersPage = new OffersPage(driver);

    }

    @AfterMethod
    public void browserQuit(){
        driver.quit();
    }
}
