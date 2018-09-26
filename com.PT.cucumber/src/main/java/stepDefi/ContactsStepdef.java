package stepDefi;
//package runner;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class ContactsStepdef {
//
//	
//	WebDriver driver;
//	
//	
//	
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//		  driver=new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.get("https://www.freecrm.com/index.html");
//		  Thread.sleep(5000);
//	}
//
//	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String username, String password) throws Throwable {
//		  String title=driver.getTitle();
//		   System.out.println("the title of page is : "+title);
//		   Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
//		   driver.findElement(By.name("username")).sendKeys(username);
//		   driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@When("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {
//		 driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
//		  Thread.sleep(3000);
//		  
//		
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//		  System.out.println("user login successfully"); 
//		  String title1=driver.getTitle();
//		  System.out.println("the title of page is : "+title1);
//		  Assert.assertEquals("CRMPRO", title1);
//		 
//	}
//
//	@When("^user moves to new contacts page$")
//	public void user_moves_to_new_contacts_page() throws Throwable {
//		 driver.switchTo().frame("mainpanel");
//      Actions action=new Actions(driver);
//      action.moveToElement(driver.findElement(By.xpath(".//*[@id='navmenu']/ul/li[4]/a"))).build().perform();
//	  driver.findElement(By.xpath("//a[@title='New Contact']")).click();
//	  Thread.sleep(5000);
//	  
//	  
//	}
//
//	@When("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_contacts_details(String firstname, String lastname, String position) throws Throwable {
//		
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//	     driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		 Thread.sleep(5000);
//	}
//
//	@Then("^Close the browser$")
//	public void close_the_browser() throws Throwable {
//		driver.quit();
//	}
//}
