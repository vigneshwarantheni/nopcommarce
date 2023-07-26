package com.nocommerce.sd;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopcommerce.runner.runner;
import nopcommercecebase.BasePage;
import nopcommercecebase.Rigester;

public class rigester extends BasePage {
	
	public static WebDriver driver =runner.driver;
	
	Rigester Rs=new Rigester(driver);
	
	@Given("user navigate to nopcommerce")
	public void user_navigate_to_nopcommerce() {
		
		get(driver, "https://demo.nopcommerce.com/");
		maximaize(driver);    
	   
	}
	@When("user navigate to registerpage")
	public void user_navigate_to_registerpage() {
		 click(Rs.getRig());
	    
	}
	@When("user select the gender")
	public void user_select_the_gender() {
		click(Rs.getMale_button());
	    
	}
	@When("user fillup firstname")
	public void user_fillup_firstname() {
	   sendkeys(Rs.getFirstname(), "Vignesh");
	}
	@When("user fillup lastname")
	public void user_fillup_lastname() {
		sendkeys(Rs.getLastname(), "s");
	   
	}
	@When("user select the dateofbirth")
	public void user_select_the_dateofbirth() {
		
		
		DropDown_visibletxt(Rs.getDob_date(), "14");
		DropDown_value(Rs.getDob_month(), "3");
		DropDown_visibletxt(Rs.getDob_year(), "1995");
	    
	}
	@When("user fill email")
	public void user_fill_email() {
		sendkeys(Rs.getEmail(), "vickybasto99@gmail.com");
	    
	}
	@When("user checknewsletter")
	public void user_checknewsletter() {
		click(Rs.getCheckbox());
	    
	}
	@When("user fillup password")
	public void user_fillup_password() {
		sendkeys(Rs.getPassword(), "Vicky@007");
		sendkeys(Rs.getConfrim_password(), "Vicky@007");
	  
	}
	@Then("user click and complete register")
	public void user_click_and_complete_register() {
	  
		click(Rs.getRegister());
	}


}
