package webtest;

import io.github.bonigarcia.wdm.WebDriverManager;
import methods.AnotherWayDelete;
import methods.BrowserSetup;
import methods.SignIn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AnotherWayDeleteTest extends BrowserSetup{
    AnotherWayDelete anotherwaydelete;

   @Test
    public void anotherDeleteTest() throws InterruptedException {
        anotherwaydelete = new AnotherWayDelete(driver);
//        anotherwaydelete.closeButton();
        anotherwaydelete.click();
//        anotherwaydelete.clickDelete();
//        anotherwaydelete.swalDel();
//        Thread.sleep(3000);
//        String expectedUrl = "";
//        String currentUrl = driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl,currentUrl);

    }
}
