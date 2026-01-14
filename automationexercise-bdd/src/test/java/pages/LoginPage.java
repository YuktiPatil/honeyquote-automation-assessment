package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.DriverFactory;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    By signupName = By.name("name");
    By signupEmail = By.xpath("//input[@data-qa='signup-email']");
    By signupBtn = By.xpath("//button[@data-qa='signup-button']");

    By loginEmail = By.xpath("//input[@data-qa='login-email']");
    By loginPassword = By.xpath("//input[@data-qa='login-password']");
    By loginBtn = By.xpath("//button[@data-qa='login-button']");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void signup(String name, String email)
     {
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupName)).sendKeys(name);
        driver.findElement(signupEmail).sendKeys(email);
        driver.findElement(signupBtn).click();
    }

    public void login(String email, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmail)).sendKeys(email);
        driver.findElement(loginPassword).sendKeys(password);
        driver.findElement(loginBtn).click();
    }
}
