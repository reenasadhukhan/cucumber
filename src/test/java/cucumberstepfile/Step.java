package cucumberstepfile;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {
	
	public WebDriver driver=null;
	

	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\derivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@When("Enter the URL {string}")
	public void enter_the_URL(String url) {
		driver.get(url);
	}	
	
	@Then("User verifies the object on page")
	public void user_verifies_the_page(DataTable datatable) throws Throwable {
		for(Map<Object, Object> user:datatable.asMaps(String.class, String.class))
		{
			
			//input [@name='firstname']
			//input [@name='lastname']
			//input [@name='reg_email__']
			
			
			//input[@value='Log In']
			//button[text()='Sign Up']
			
			
			
			
		}
		
	  
		String capText=driver.findElement(By.xpath("//span[text()='Create an account']")).getText();
		assertEquals(true,capText.contains("Create an account"));		
		driver.close();

	}
}
