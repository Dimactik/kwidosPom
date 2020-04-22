package Page;

import Test.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class MainPage extends BaseTest {


    @FindBy(xpath = "//p[contains(text(), 'CONTRACTORS')]")
    public WebElement contractors;

   //public String contractors = "//p[contains(text(), 'CONTRACTORS')]";
    public String myOffers = "[href='/offer/myOffers']";

    public MainPage(WebDriver driver){
        super(driver);
    }


    public MainPage contractorsClick(){
        contractors.click();
        return this;
    }


}
