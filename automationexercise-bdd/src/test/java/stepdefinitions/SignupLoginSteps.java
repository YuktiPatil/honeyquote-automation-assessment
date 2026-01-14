package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import base.DriverFactory;
import org.testng.Assert;
import pages.*;

public class SignupLoginSteps {

    LoginPage loginPage;
    SignupPage signupPage;
    HomePage homePage;

    String email;
    String password = "Test@123";

    @Before
    public void setup() {
        DriverFactory.initDriver();
        loginPage = new LoginPage(DriverFactory.driver, DriverFactory.wait);
        signupPage = new SignupPage(DriverFactory.driver, DriverFactory.wait);
        homePage = new HomePage(DriverFactory.driver, DriverFactory.wait);
        email = "test" + System.currentTimeMillis() + "@mail.com";
    }

    @Given("user launches the application")
    public void launchApp() { }

    @When("user signs up with valid details")
    public void signup() {
        loginPage.signup("Yukti", email);
        signupPage.fillDetails(password);
    }

    @Then("account should be created successfully")
    public void validateSignup() {
        Assert.assertTrue(signupPage.isAccountCreated());
    }

    @When("user continues to home page")
    public void continueb() {
        homePage.continueb();
    }

    @When("user logs out")
    public void logout() {
        homePage.logout();
    }

    @When("user logs in with same credentials")
    public void login() {
        loginPage.login(email, password);
    }

    @Then("user should be logged in successfully")
    public void validateLogin() {
        Assert.assertTrue(homePage.isLoggedIn());
    }

    @And("user logs out again")
    public void logoutAgain() {
        homePage.logout();
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
