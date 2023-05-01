package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    WebDriver driver;
    public SignIn(WebDriver driver) {
        this.driver = driver;
    }
    By EMAIL = By.id("email");
    By PASSWORD = By.id("password");
    By LOGIN_BUTTON = By.xpath("//button[normalize-space()='Login']");

    public void loginCredential(String email, String password){
        driver.findElement(EMAIL).sendKeys(email);
        driver.findElement(PASSWORD).sendKeys(password);
    }
    public void LoginButton(){
        driver.findElement(LOGIN_BUTTON).click();
    }

}
