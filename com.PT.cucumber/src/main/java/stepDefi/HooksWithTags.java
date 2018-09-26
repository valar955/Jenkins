package stepDefi;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksWithTags {

	
	
	
	//Global Hooks
		@Before
		public void setUp() {
			
			System.out.println("Launch browser");
			System.out.println("Enter URL for free CRM App");
		}
		
		
		@After
		public void tearDown() {
			System.out.println("close the browser");
		}
		
//	//Global Hooks_1
//	@Before(order=0)
//	public void setUp1() {
//		
//		System.out.println("Launch browser");
//		System.out.println("Enter URL for free CRM App");
//	}
//	
//	
//	@After(order=0)
//	public void tearDown1() {
//		System.out.println("close the browser");
//	}
//	//Global Hooks_2
//	@Before(order=1)
//	public void setUp2() {
//		
//		System.out.println("Launch browser1");
//		System.out.println("Enter URL for free CRM App1");
//	}
//	
//	
//	@After(order=1)
//	public void tearDown2() {
//		System.out.println("close the browser1");
//	}
//	
//	
	//Local-only for the first scenario 	
	@Before("@First")
	public void beforeFirst() {
		
		
		System.out.println("Before for first tag");
	}
	
	
	@After("@First")
	public void afterFirst() {
		
		System.out.println("After for first tag");
	}
	
	//Local-only for the second scenario 
	@Before("@Second")
	public void beforeSecond() {
		
		
		System.out.println("Before for Second tag");
	}
	
	
	@After("@Second")
	public void afterSecond() {
		
		System.out.println("After for Second tag");
	}
	
	//Local-only for the third scenario 
	@Before("@Third")
	public void beforeThird() {
		
		
		System.out.println("Before for Third tag");
	}
	
	
	@After("@Third")
	public void afterThird() {
		
		System.out.println("After for Third tag");
	}
	

	
	@Given("^this is the first step$")
	public void this_is_the_first_step() throws Throwable {
		System.out.println("Step1");
	}

	@When("^this is the second step$")
	public void this_is_the_second_step() throws Throwable {
		System.out.println("Step2");
	}

	@Then("^this is the third step$")
	public void this_is_the_third_step() throws Throwable {
		System.out.println("Step3");
	}
	
	
	
	
	

	
	
	
	
}
