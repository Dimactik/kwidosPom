package Page;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseTest {

    String url = "https://kwidos.tk/auth/login";
    public String expectedUrl = "https://kwidos.tk/";
    public String emailErrorMessage = "//div[contains(text(), 'Email is required')]";
    public String passwordErrorMessage = "//div[contains(text(), 'Password is required')]";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openBrowser(){
        driver.get(url);
    }

    public void enterEmail(String email){
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(By.id("email")).sendKeys(email);
//        WebElement element;
//        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
//        element.sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickSignInButton(){
        driver.findElement(By.xpath("//button[contains(text(), 'SIGN IN')]")).click();
    }



}
