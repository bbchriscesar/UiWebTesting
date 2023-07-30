package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    private final By lnkCategory1 = By.cssSelector(".list-group > a:nth-child(1)");
    private final By lnkCategory2 = By.cssSelector(".list-group > a:nth-child(2)");
    private final By lnkCategory3 = By.cssSelector(".list-group > a:nth-child(3)");
    private final By checkOutButton = By.cssSelector("#navbarResponsive > ul > li > a");

    private final By productHeaderLocator = By.xpath("//table[@class='table table-hover']//th[contains(text(), 'Product')]");
    private final By quantityHeaderLocator = By.xpath("//table[@class='table table-hover']//th[contains(text(), 'Quantity')]");

    private final By priceHeaderLocator = By.xpath("//table[@class='table table-hover']//th[contains(text(), 'Price')]");
    private final By totalHeaderLocator = By.xpath("//table[@class='table table-hover']//th[contains(text(), 'Total')]");





    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getCategory1LinkText() {
        return getLinkText(lnkCategory1);
    }

    public String getCategory2LinkText() {
        return getLinkText(lnkCategory2);
    }

    public String getCategory3LinkText() {
        return getLinkText(lnkCategory3);
    }

    public void clickCheckoutButton() {
        click(checkOutButton);
    }

    public String getProductHeaderText() {
        return getLinkText(productHeaderLocator);
    }

    public String getQuantityHeaderText() {
        return getLinkText(quantityHeaderLocator);
    }

    public String getPriceHeaderText() {
        return getLinkText(priceHeaderLocator);
    }

    public String getTotalHeaderText() {
        return getLinkText(totalHeaderLocator);
    }

}
