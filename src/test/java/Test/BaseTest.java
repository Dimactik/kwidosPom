package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public BaseTest(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 4);
        PageFactory.initElements(driver, this);
    }

    @BeforeMethod
    public void browserSetup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("ignore-certificate-errors");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();



//        loginPage = new LoginPage(driver);
//        mainPage = new MainPage(driver);
//        offersPage = new OffersPage(driver);

    }

    @AfterMethod
    public void browserQuit(){
        driver.quit();
    }

}
