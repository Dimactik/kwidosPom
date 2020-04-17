package Page;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BaseTest {

   public String contractors = "//p[contains(text(), 'CONTRACTORS')]";
    public String myOffers = "[href='/offer/myOffers']";

    public MainPage(WebDriver driver){
        this.driver=driver;
    }


    public void contractorsClick(){
       driver.findElement(By.xpath(contractors)).click();
    }


}
