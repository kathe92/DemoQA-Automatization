package stepdefinitions.WebForm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstTest {
    private ChromeDriver driver;

    @Given("The user fill all the required fields of the form")
    public void the_user_fill_all_the_required_fields_of_the_form() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
    }
    @When("The user enter First Name")
    public void the_user_enter_first_name() {
        System.out.println("The user enter First Name");
        driver.findElement(By.id("firstName")).sendKeys("Katherine");
    }
    @When("The user enter Last Name")
    public void the_user_enter_last_name() {
        System.out.println("The user enter Second Name");
        driver.findElement(By.id("lastName")).sendKeys("Perez");
    }
    @When("The user select a gender")
    public void the_user_select_a_gender() {
        System.out.println("The user select a gender");
        WebElement gender = driver.findElement(By.xpath("//*[@id=\'genterWrapper\']/div[2]/div[2]/label"));
        gender.click();
    }
    @When("The user enter a mobile number")
    public void the_user_enter_a_mobile_number() {
        System.out.println("The user enter a mobile number");
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
    }

    @When("The user clickon the submit button")
    public void the_user_clickon_the_submit_button() {
        System.out.println("The user click on the Submit button");
        WebElement submit = driver.findElement(By.id("submit"));
        submit.click();
    }

    @Then("The system show a popup with the confirmation of the new record")
    public void the_system_show_a_popup_with_the_confirmation_of_the_new_record() {
        WebElement confirmation = driver.findElement(By.xpath("//*[@id=\'example-modal-sizes-title-lg\']"));
        String message = confirmation.getText();
        String expectedTitle = "Thanks for submitting the form";
        Assert.assertEquals(message, expectedTitle);
        driver.quit();
    }
}
