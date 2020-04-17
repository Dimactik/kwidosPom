package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    String contractorsUrl = "https://kwidos.tk/contractor/search";

    @Test
    public void loginSuccess() throws InterruptedException {

        loginPage.openBrowser();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
       loginPage.enterEmail("ccqyzdtryugrspfddo@awdrt.com");
       loginPage.enterPassword("Qwerty12");
       loginPage.clickSignInButton();

       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mainPage.contractors)));

       mainPage.contractorsClick();



        wait.until(ExpectedConditions.urlToBe("https://kwidos.tk/contractor/search"));

        Assert.assertEquals(driver.getCurrentUrl(), contractorsUrl);


    }

}
