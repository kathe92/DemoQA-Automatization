package stepdefinitions.RadioButton;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FirstTestRadioButton {
    private ChromeDriver driver;

    @Given("The user search for the Yes radio button in the section Elements-Radio Button")
    public void the_user_search_for_the_yes_radio_button_in_the_section_elements_radio_button() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
    }
    @When("The user click on Yes radio button")
    public void the_user_click_on_yes_radio_button() {
        driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[1]/div[2]/label")).click();
    }
    @Then("The system show a the message You have selected Yes")
    public void the_system_show_a_the_message_you_have_selected_yes() {
        WebElement confirmation = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p/span"));
        String message = confirmation.getText();
        String expectedTitle = "Yes";
        Assert.assertEquals(message, expectedTitle);
        driver.quit();
    }
}
