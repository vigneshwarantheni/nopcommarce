package com.login.sd;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopcommerce.runner.runner;
import nopcommercecebase.BasePage;
import nopcommercecebase.Rigester;
import nopcommercecebase.login;

public class Sd_login extends BasePage {

	public static WebDriver driver= runner.driver;
	Rigester Ri=new Rigester(driver);
@Given("user navigate to the login page")
public void user_navigate_to_the_login_page() {
	get(driver, "https://demo.nopcommerce.com/");
	click(Ri.getLogin());

}

login ln=new login(driver);
@When("user enter username")
public void user_enter_username() {
   sendkeys(ln.getUsername(), "vickybasto99@gmail.com");
}
@When("user entr password")
public void user_entr_password() {
    sendkeys(ln.getPassword(), "Vicky@007");
}
@Then("user sucessfuly login")
public void user_sucessfuly_login() {
    click(ln.getLogin());
}

}
