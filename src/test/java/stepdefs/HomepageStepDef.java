package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import utils.SharedDriver;

public class HomepageStepDef {

    private final HomePage homePage = new HomePage(SharedDriver.getDriver());

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        // Code to navigate to the homepage
        //driver.get("https://www.example.com/homepage");
    }

    @Then("I should see the homepage elements")
    public void i_should_see_the_homepage_elements() {
        // Code to verify that the homepage elements are displayed
        //WebElement element = driver.findElement(By.id("homepage-element"));
        //assert element.isDisplayed();
    }

}
