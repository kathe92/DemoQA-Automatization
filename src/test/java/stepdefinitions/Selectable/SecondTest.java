package stepdefinitions.Selectable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SecondTest {
    private ChromeDriver driver;

    @Given("The user search for the Grid tab")
    public void the_user_search_for_the_grid_tab() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/selectable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"demo-tab-grid\"]")).click();
    }
    @When("The user click on the item One of the list")
    public void the_user_click_on_the_item_one_of_the_list() {
        driver.findElement(By.xpath("//*[@id=\'row1\']/li[1]")).click();
    }
    @When("The user click on the item Five of the list")
    public void the_user_click_on_the_item_five_of_the_list() {
        driver.findElement(By.xpath("//*[@id=\'row2\']/li[2]")).click();
        ((JavascriptExecutor)driver).executeScript("scroll(0,200)");
    }
    @When("The user click on the item Nine of the list")
    public void the_user_click_on_the_item_nine_of_the_list() {
        driver.findElement(By.xpath("//*[@id=\'row3\']/li[3]")).click();
    }
    @When("The user wait {int} seconds")
    public void the_user_wait_seconds(Integer int1) {
        System.out.println("Wait 3 seconds");
        driver.manage().timeouts().implicitlyWait(int1 , TimeUnit.SECONDS);
    }
    @When("The user click on the item Nine of the list again")
    public void the_user_click_on_the_item_nine_of_the_list_again() {
        driver.findElement(By.xpath("//*[@id=\'row1\']/li[1]")).click();
    }
    @When("The user click on the item Five of the list again")
    public void the_user_click_on_the_item_five_of_the_list_again() {
        driver.findElement(By.xpath("//*[@id=\'row2\']/li[2]")).click();
    }
    @When("The user click on the item One of the list again")
    public void the_user_click_on_the_item_one_of_the_list_again() {
        driver.findElement(By.xpath("//*[@id=\'row3\']/li[3]")).click();
    }
    @Then("The system show the items deselect")
    public void the_system_show_the_items_deselect() {
        System.out.println("All the items were deselected");
        driver.quit();
    }
}
