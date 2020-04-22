package Page;

import Test.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OffersPage extends BaseTest {

    String url = "https://kwidos.tk/offer/search";
    public String serviceTypeMenu = " div.col-md-4.col-md-push-8.ng-star-inserted > div > div:nth-child(2) > div:nth-child(2) > p-multiselect";
    String getServiceTypeMenu3DCapture = "\'3D Capture\'";
    public String selector3DCapture = "//p[contains(text(), '3D Capture')]";
    public List<WebElement> list3DCapture;


    public OffersPage(WebDriver driver){
        super(driver);
    }

    public void openBrowser(){
        driver.get(url);
    }

    public void selectServiceTypeMenu (){
        driver.findElement(By.cssSelector(serviceTypeMenu)).click();
    }

    public void selectOptionServiceTypeMenu3DCapture(){
        driver.findElement(By.xpath("//label[contains(text(),"+" " +getServiceTypeMenu3DCapture+" )]")).click();
    }

    public void select3DCaptureList(){
        list3DCapture = driver.findElements(By.xpath(selector3DCapture));
    }
}
