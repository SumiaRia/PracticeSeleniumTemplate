package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnotherWayDelete {
    WebDriver driver;
    public AnotherWayDelete(WebDriver driver) {
        this.driver = driver;
    }
    By VIEW = By.xpath("//tbody/tr[1]/td[5]/a[1]");
    By ANOTHERWAYDELETE =By.xpath("//a[normalize-space()='Delete']");
    By LOCALIZATION = By.xpath("//a[normalize-space()='Localization']");
    By LANGUAGE = By.xpath("//a[normalize-space()='Languages']");
    By SWAL_DELETE_BUTTON = By.cssSelector(".swal-button.swal-button--confirm.swal-button--danger");
    By CLOSE = By.xpath("//a[@class='phpdebugbar-close-btn']");

    public void closeButton(){
        driver.findElement(CLOSE).click();
    }
    public void click(){
        driver.findElement(LOCALIZATION).click();
        driver.findElement(LANGUAGE).click();
        driver.findElement(VIEW).click();
    }
    public void clickDelete(){
        driver.findElement(ANOTHERWAYDELETE).click();

    }
    public void swalDel(){
        driver.findElement(SWAL_DELETE_BUTTON).click();
    }
}
