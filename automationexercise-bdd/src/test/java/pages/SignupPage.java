package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import base.DriverFactory;

public class SignupPage {

    WebDriver driver;
    WebDriverWait wait;

    By password = By.id("password");
    By firstName = By.id("first_name");
    By lastName = By.id("last_name");
    By address = By.id("address1");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobile = By.id("mobile_number");
    By createBtn = By.xpath("//button[@data-qa='create-account']");
    By successMsg = By.xpath("//b[text()='Account Created!']");

    public SignupPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void fillDetails(String pwd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(pwd);
        driver.findElement(firstName).sendKeys("Yukti");
        driver.findElement(lastName).sendKeys("Patil");
        driver.findElement(address).sendKeys("India");
        driver.findElement(state).sendKeys("KA");
        driver.findElement(city).sendKeys("Pune");
        driver.findElement(zipcode).sendKeys("411057");
        driver.findElement(mobile).sendKeys("9999999999");
        driver.findElement(createBtn).click();
    }

    public boolean isAccountCreated() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg)).isDisplayed();
    }
}
