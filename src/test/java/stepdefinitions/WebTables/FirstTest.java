package stepdefinitions.WebTables;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    private ChromeDriver driver;
    String info;
    String newDepartment = "Marketing";

    @Given("The user searches for the first row in the table located in the section Web Tables")
    public void the_user_searches_for_the_first_row_in_the_table_located_in_the_section_web_tables() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
    }
    @When("The user searches for the department stored in the first row")
    public void the_user_searches_for_the_department_stored_in_the_first_row() {
        WebElement previousDepartment = driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[6]"));
        info = previousDepartment.getText();
    }
    @When("The user click on the Edit button of the first row")
    public void the_user_click_on_the_edit_button_of_the_first_row() {
        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"edit-record-1\"]"));
        editButton.click();
    }
    @When("The user enter a new department")
    public void the_user_enter_a_new_department() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement department = driver.findElement(By.xpath("//*[@id=\"department\"]"));
        department.sendKeys(Keys.CONTROL + "a");
        department.sendKeys(newDepartment);
    }
    @When("The user click on Save button")
    public void the_user_click_on_save_button() {
        WebElement submit = driver.findElement(By.xpath("//*[@id=\'submit\']"));
        submit.click();
    }
    @Then("The record was updated")
    public void the_record_was_updated() {
        WebElement currentDepartment = driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[6]"));
        String updatedInfo = currentDepartment.getText();
        Assert.assertNotEquals(info,updatedInfo);
        driver.quit();
    }
}
