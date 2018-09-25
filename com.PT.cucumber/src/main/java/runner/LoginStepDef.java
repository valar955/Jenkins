package runner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {

	
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws Throwable {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.freecrm.com/index.html");
	  Thread.sleep(5000);
	  
	}

	@When("^User enter the username$")
	public void user_enter_the_username() throws Throwable {
	   String title=driver.getTitle();
	   System.out.println("the title of page is : "+title);
	   Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	   driver.findElement(By.name("username")).sendKeys("valar955");
	   
	  
	}

	@When("^User enter the password$")
	public void user_enter_the_password() throws Throwable {
		  driver.findElement(By.name("password")).sendKeys("valar955");
		  driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
		  Thread.sleep(3000);
		  
		  System.out.println("the title of page is : "+driver.getTitle());
	}

	@Then("^User should login successfully$")
	public void user_should_login_successfully() {
	    
		
		System.out.println("user login successfully");
		driver.quit();
	}

}
