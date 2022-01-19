package stepdefinitions.RadioButton;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SecondTestRadioButton {
    private ChromeDriver driver;

    @Given("The user search for the Impressive radio button in the section Elements-Radio Button")
    public void the_user_search_for_the_impressive_radio_button_in_the_section_elements_radio_button() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
    }
    @When("The user first click on Yes radio button")
    public void the_user_first_click_on_yes_radio_button() {
        driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[1]/div[2]/label")).click();
    }
    @When("The user later click on Impressive radio button")
    public void the_user_later_click_on_impressive_radio_button() {
        driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[2]/div[1]/div[3]/label")).click();
    }
    @Then("The system show a the message You have selected Impressive")
    public void the_system_show_a_the_message_you_have_selected_impressive() {
        WebElement impressive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/p/span"));
        String message = impressive.getText();
        String ExpectedTitle = "Impressive";
        Assert.assertEquals(message, ExpectedTitle);
        driver.quit();
    }
}
