package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.id("signInBtn");
    private final By loggedInElement = By.id("navbarResponsive");
    private final By errorMessageLocator = By.cssSelector("#login-form > div.alert.alert-danger");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        enterText(usernameField, username);
    }

    public void enterPassword(String password) {
        enterText(passwordField, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public boolean isLoggedIn() {
        return !getWait().until(ExpectedConditions.numberOfElementsToBeMoreThan(loggedInElement, 0)).isEmpty();
    }

    public boolean isErrorMessageDisplayed() {
        WebElement errorMessageElement = getWait().until(ExpectedConditions.visibilityOfElementLocated(errorMessageLocator));
        return errorMessageElement.isDisplayed();
    }
}
