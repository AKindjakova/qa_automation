package lv.acodemy.steps_definition;

import io.cucumber.java.en.Given;
import lv.acodemy.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonStepDefs {

    private final WebDriver driver = DriverManager.getInstance();

    @Given("user opens {string}")
    public void userOpenUrl(String url) {
        ChromeDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
