package stepdefinitions.Selectable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class FirstTest {
    private ChromeDriver driver;

    @Given("The user search for the List tab")
    public void the_user_search_for_the_list_tab() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/selectable");
        driver.manage().window().maximize();
    }
    @When("The user click on the first item of the list")
    public void the_user_click_on_the_first_item_of_the_list() {
        driver.findElement(By.xpath("//*[@id=\'verticalListContainer\']/li[1]")).click();
    }
    @When("The user click on the second item of the list")
    public void the_user_click_on_the_second_item_of_the_list() {
        driver.findElement(By.xpath("//*[@id=\'verticalListContainer\']/li[3]")).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
    }
    @When("The user click on the third item of the list")
    public void the_user_click_on_the_third_item_of_the_list() {
        driver.findElement(By.xpath("//*[@id=\'verticalListContainer\']/li[2]"));
    }
    @When("The user wait {int} second")
    public void the_user_wait_second(Integer int1) {
        System.out.println("Wait 1 second");
        driver.manage().timeouts().implicitlyWait(int1 , TimeUnit.SECONDS);
    }
    @When("The user deselects all items")
    public void the_user_deselects_all_items() {
        driver.findElement(By.xpath("//*[@id=\'verticalListContainer\']/li[1]")).click();
        driver.findElement(By.xpath("//*[@id=\'verticalListContainer\']/li[3]")).click();
        driver.findElement(By.xpath("//*[@id=\'verticalListContainer\']/li[2]"));
    }
    @Then("The system show all items deselect")
    public void the_system_show_all_items_deselect() {
        System.out.println("All the items were deselected");
        driver.quit();
    }
}
