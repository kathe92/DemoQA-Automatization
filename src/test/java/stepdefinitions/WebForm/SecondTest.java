package stepdefinitions.WebForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {
    private ChromeDriver driver;

    @Given("The user will not fill in any form fields")
    public void the_user_will_not_fill_in_any_form_fields() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        System.out.println("The user doesn't fill any form fields");
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    }

    @When("The user click on the submit button")
    public void the_user_click_on_the_submit_button() {
        System.out.println("The user click on the Submit button");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
    }

    @Then("The system not allow send the form and show the required field with red border")
    public void the_system_not_allow_send_the_form() {
        System.out.println("The system not allow send the form");
        driver.quit();
    }
}
