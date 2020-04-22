package Test;

import Page.LoginPage;
import Page.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    String contractorsUrl = "https://kwidos.tk/contractor/search";

    public LoginTest(WebDriver driver) {
        super(driver);
    }

    @Test
    public void loginSuccess(){

        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = new MainPage(driver);

        loginPage.openBrowser()
       .enterEmail("ccqyzdtryugrspfddo@awdrt.com")
       .enterPassword("Qwerty12")
       .clickSignInButton();

       wait.until(ExpectedConditions.visibilityOfAllElements(mainPage.contractors));

       mainPage.contractorsClick();



        wait.until(ExpectedConditions.urlToBe("https://kwidos.tk/contractor/search"));

        Assert.assertEquals(driver.getCurrentUrl(), contractorsUrl);


    }

}
