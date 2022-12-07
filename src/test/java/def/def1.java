package def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class def1 {
	WebDriver Driver;

	@Given("I should open the browser and naviagte to the login page of guru99")
	public void i_should_open_the_browser_and_naviagte_to_the_login_page_of_guru99() {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	@When("Enter Username {string}")
	public void enter_username(String string) throws InterruptedException {
		Thread.sleep(3000);
		Driver.findElement(By.name("userName")).sendKeys(string);

	}
	@And("Enter Password {string}")
	public void enter_password(String string) throws InterruptedException {
		Thread.sleep(3000);
		Driver.findElement(By.name("password")).sendKeys(string);
	}
	@Then("Click on the loginbutton")
	public void click_on_the_loginbutton() throws InterruptedException {
		Thread.sleep(3000);
		Driver.findElement(By.name("submit")).click(); 
	}



}
