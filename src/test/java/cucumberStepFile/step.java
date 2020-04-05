package cucumberStepFile;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step {
	
	public WebDriver driver=null;
	

	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\selenium\\src\\test\\resources\\derivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("^Enter the URL$")
	public void enter_the_URL() throws Throwable {
		driver.get("https://www.facebook.com/");
	    
	}
	
	
	@Then("^User verifies the page$")
	public void user_verifies_the_page() throws Throwable {
		System.out.println("DDD");
	  
		String capText=driver.findElement(By.xpath("//span[text()='Create an account']")).getText();
		assertEquals(true,capText.contains("Create an account"));
		//System.out.println(capText);
		//assertTrue(capText.contains("Create a new account"));
		driver.close();

	}
}
