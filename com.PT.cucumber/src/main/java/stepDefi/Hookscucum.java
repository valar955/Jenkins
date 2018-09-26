//package stepDefi;
//
//import org.openqa.selenium.WebDriver;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Hookscucum {
//
//	//WebDriver driver;
//	
//	@Before
//	public void setUp() {
//		
//		System.out.println("Launch browser");
//		System.out.println("Enter URL for free CRM App");
//	}
//	@After
//	public void tearDown() {
//		System.out.println("close the browser");
//	}
//	
//	
//	@Given("^user is on deal page$")
//	public void user_is_on_deal_page() throws Throwable {
//	    System.out.println("user is on deal page");
//	}
//
//	@When("^user fills the deals form$")
//	public void user_fills_the_deals_form() throws Throwable {
//		System.out.println("user fills the deals form");
//	}
//
//	@Then("^deal is created$")
//	public void deal_is_created() throws Throwable {
//		System.out.println("deal is created");
//	}
//
//	@Given("^user is on contact page$")
//	public void user_is_on_contact_page() throws Throwable {
//		System.out.println("user is on contact page");
//	}
//
//	@When("^user fills the contacts form$")
//	public void user_fills_the_contacts_form() throws Throwable {
//		System.out.println("user fills the contacts form");
//	}
//
//	@Then("^contact is created$")
//	public void contact_is_created() throws Throwable {
//		System.out.println("contact is created");
//	}
//	
//	@Given("^user is on mail page$")
//	public void user_is_on_mail_page() throws Throwable {
//		System.out.println("user is on mail page");
//	}
//
//	@When("^user fills the mail form$")
//	public void user_fills_the_mail_form() throws Throwable {
//		System.out.println("user fills the mail form");
//	}
//
//	@Then("^mail is created$")
//	public void mail_is_created() throws Throwable {
//		System.out.println("mail is created");
//	}
//
//}
