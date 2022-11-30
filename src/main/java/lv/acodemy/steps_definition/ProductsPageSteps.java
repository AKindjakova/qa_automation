package lv.acodemy.steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lv.acodemy.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPageSteps {

    private final ProductsPage productPage = new ProductsPage();

    @Given("user selects {string} product from a list")
    public void userSelectsProductFromList(String productName) {
        productPage.clickOnProductByName(productName);
    }

    public static class ProductsPage {
        private WebDriver driver = DriverManager.getInstance();
        private By productLabel = By.xpath("//h2[@class='woocommerce-loop-product__title']");

        public void clickOnProductByName(String productName) {
            List<WebElement> elements = driver.findElements(productLabel);
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i).getText().equals(productName)) {
                    elements.get(i).click();
                    break;
                }
            }
        }
    }
}
