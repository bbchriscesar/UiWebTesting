package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import utils.SharedDriver;

public class HomepageStepDef {

    private final WebDriver driver;
    private final HomePage homePage;

    private static final String EXPECTED_CATEGORY_1_LINK_TEXT = "Category 1";
    private static final String EXPECTED_CATEGORY_2_LINK_TEXT = "Category 2";
    private static final String EXPECTED_CATEGORY_3_LINK_TEXT = "Category 3";
    private static final String EXPECTED_PRODUCT_HEADER_TEXT = "Product";
    private static final String EXPECTED_QUANTITY_HEADER_TEXT = "Quantity";
    private static final String EXPECTED_PRICE_HEADER_TEXT = "Price";
    private static final String EXPECTED_TOTAL_HEADER_TEXT = "Total";


    public HomepageStepDef() {
        this.driver = SharedDriver.getDriver();
        this.homePage = new HomePage(driver);
    }

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        String currentUrl = driver.getTitle();
        Assert.assertEquals(currentUrl, "ProtoCommerce");
    }

    @Then("I should see the homepage elements")
    public void i_should_see_the_homepage_elements() {
        String category1LinkText = homePage.getCategory1LinkText();
        String category2LinkText = homePage.getCategory2LinkText();
        String category3LinkText = homePage.getCategory3LinkText();

        Assert.assertEquals(category1LinkText, EXPECTED_CATEGORY_1_LINK_TEXT);
        Assert.assertEquals(category2LinkText, EXPECTED_CATEGORY_2_LINK_TEXT);
        Assert.assertEquals(category3LinkText, EXPECTED_CATEGORY_3_LINK_TEXT);
    }

    @When("I click on a navigation link")
    public void i_click_on_a_navigation_link() {
        homePage.clickCheckoutButton();
    }

    @Then("I should be redirected to the corresponding page")
    public void i_should_be_redirected_to_the_corresponding_page() {
        String productHeaderText = homePage.getProductHeaderText();
        String quantityHeaderText = homePage.getQuantityHeaderText();
        String priceHeaderText = homePage.getPriceHeaderText();
        String totalHeaderText = homePage.getTotalHeaderText();

        Assert.assertEquals(productHeaderText, EXPECTED_PRODUCT_HEADER_TEXT);
        Assert.assertEquals(quantityHeaderText, EXPECTED_QUANTITY_HEADER_TEXT);
        Assert.assertEquals(priceHeaderText, EXPECTED_PRICE_HEADER_TEXT);
        Assert.assertEquals(totalHeaderText, EXPECTED_TOTAL_HEADER_TEXT);
    }


}
