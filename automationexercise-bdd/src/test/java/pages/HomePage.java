package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import base.DriverFactory;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By loggedInText = By.xpath("//a[contains(text(),'Logged in as')]");
    By continueBtn = By.xpath("//a[@data-qa='continue-button']");
    By logoutBtn = By.xpath("//a[text()=' Logout']");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public boolean isLoggedIn() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInText)).isDisplayed();
    }

    public void continueb() {
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
        driver.get("https://automationexercise.com/");
    }

    public void logout() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)).click();
    }
}
