package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.LoginPage;
import utils.SharedDriver;
import utils.StepUtils;

public class LoginStepDef {
    private final WebDriver driver;
    private final LoginPage loginPage;

    public LoginStepDef() {
        this.driver = SharedDriver.getDriver();
        this.loginPage = new LoginPage(driver);
    }

    @Given("^I am on the login page")
    public void i_am_on_the_login_page() {
        StepUtils.navigateToLoginPage(driver);
    }

    @When("^I enter my username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_my_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("^I enter an incorrect username \"([^\"]*)\" or password \"([^\"]*)\"$")
    public void i_enter_an_incorrect_username_or_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("^I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("^I should be logged in")
    public void i_should_be_logged_in() {
        Assert.assertTrue(loginPage.isLoggedIn());
    }

    @Then("^I should see an error message$")
    public void i_should_see_an_error_message() {
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }
}
