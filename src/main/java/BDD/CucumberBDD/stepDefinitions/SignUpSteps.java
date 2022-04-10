package BDD.CucumberBDD.stepDefinitions;



import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;

import BDD.CucumberBDD.PageObjects.signUpPage;
import BDD.CucumberBDD.Utils.CommonMethods;
import BDD.CucumberBDD.testBase.DriverInit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class SignUpSteps {
	
	
	
	private signUpPage sp = new signUpPage(DriverInit.getDriver());
	private CommonMethods cm = new CommonMethods();


	
	@Given("User navigates to techalistic website")
	public void user_navigates_to_techalistic_website() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Site url launched");
	  
	}

//	@Given("User enters firstname\"([^\"]*)\"$")
//	public void user_enters_firstname(String fname) {
//	    // Write code here that turns the phrase above into concrete actions
//		sp.addFirstName(fname);
//	}

	@And("User enters firstname \"(.*)\"$")
	public void user_enters_firstname(String fname) {
	    // Write code here that turns the phrase above into concrete actions
	    sp.addFirstName(fname);
	}

	
	@And("User enters lastname \"(.*)\"$")
	public void user_enters_lastname(String lname) {
	    // Write code here that turns the phrase above into concrete actions
		 sp.addLastName(lname);
	}

	@And("User enters gender \"(.*)\"$")
	public void user_enters_gender_male(String male) {
	    // Write code here that turns the phrase above into concrete actions
		 sp.clickRbGender(male);
	}

	@And("User enters YOE \"(.*)\"$")
	public void user_enters_YOE(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("yoe");
	}
	
	@And("user clicks download link")
	public void user_clicks_download_link() {
	    // Write code here that turns the phrase above into concrete actions
		 sp.clickLinkDownload();
	}
	
	@Then("user navigated to github")
	public void user_navigated_to_github() {
	    // Write code here that turns the phrase above into concrete actions
		boolean pageTitle = cm.getTitleofPage().equals("behave-rest/conf.yaml at master · stanfy/behave-rest · GitHub");
		Asserts.check(pageTitle,"Different Page Loaded");
	}
	

	
}
