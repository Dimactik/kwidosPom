package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OffersTest extends BaseTest {

    @Test
    public void selecting3DCapture() {

        offersPage.openBrowser();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(offersPage.serviceTypeMenu)));
        offersPage.selectServiceTypeMenu();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), '3D Capture')]")));
        offersPage.selectOptionServiceTypeMenu3DCapture();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(offersPage.selector3DCapture)));
        offersPage.select3DCaptureList();

        Assert.assertEquals(offersPage.list3DCapture.size(), 10);


    }




}
