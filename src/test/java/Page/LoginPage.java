package Page;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BaseTest {

    String url = "https://kwidos.tk/auth/login";
    public String expectedUrl = "https://kwidos.tk/";

    @FindBy(xpath = "//div[contains(text(), 'Email is required')]")
    private WebElement emailErrorMessage;

    @FindBy(xpath = "//div[contains(text(), 'Password is required')]")
    private WebElement passwordErrorMessage;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

//    public String emailErrorMessage = "//div[contains(text(), 'Email is required')]";
//    public String passwordErrorMessage = "//div[contains(text(), 'Password is required')]";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openBrowser(){
        driver.get(url);
        return this;
    }

    public LoginPage enterEmail(String emails){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys(emails);
        return this;
    }

    public LoginPage enterPassword(String passwords){
        password.sendKeys(passwords);
        return this;
    }

    public MainPage clickSignInButton(){
        driver.findElement(By.xpath("//button[contains(text(), 'SIGN IN')]")).click();
        return new MainPage(driver);
    }



}
