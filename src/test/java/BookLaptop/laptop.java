package BookLaptop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import nopcommerce.runner.runner;
import nopcommercecebase.Add_Cart;
import nopcommercecebase.Address;
import nopcommercecebase.BasePage;
import nopcommercecebase.Checkout;
import nopcommercecebase.Computer_page;
import nopcommercecebase.Frontpage;
import nopcommercecebase.Rigester;
import nopcommercecebase.login;

public class laptop  extends BasePage{
	public static WebDriver driver=runner.driver;
	
	Rigester Ri=new Rigester(driver);
	login ln=new login(driver);
	Frontpage fp=new Frontpage(driver);
	Computer_page cp=new Computer_page(driver);
	Add_Cart ac=new Add_Cart(driver);
	Checkout co=new Checkout(driver);
	
	
	@SuppressWarnings("deprecation")
	@Given("user navigate to the nopcommerce")
	public void user_navigate_to_the_nopcommerce() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		get(driver, "https://demo.nopcommerce.com/");
		maximaize(driver);
		click(Ri.getLogin());
		
	    
	}

	@When("user given credincial for login")
	
	public void user_given_credincial_for_login() throws InterruptedException {
		Thread.sleep(2000);
		sendkeys(ln.getUsername(), "vickybasto99@gmail.com");
		sendkeys(ln.getPassword(), "Vignesh@95");
		click(ln.getLogin());
	 
	}

	@When("user navigate to the laptop page")
	public void user_navigate_to_the_laptop_page() {
		movetoelemant(fp.getComputers(), driver);
		click(fp.getNotebook_com());
	   
	}

	@When("user add a laptop in cart")
	public void user_add_a_laptop_in_cart() throws InterruptedException {
		Thread.sleep(3000);
		
		click(cp.getApple());
	    
	}

	@Then("user navigate to the cart page")
	public void user_navigate_to_the_cart_page() throws InterruptedException {
		click(ac.getApple_addtocart());
		
		Thread.sleep(2000);
	
		click(ac.getCart_button());
	    
	}
	
	@Given("user select gift wraping")
	public void user_select_gift_wraping() {
		DropDown_value(co.getGift_wraping(), "2");
	    
	}

	@When("user agree to terms")
	public void user_agree_to_terms() {
		click(co.getAgree_checkbox());
	    
	}

	@Then("user click checkout for conformation")
	public void user_click_checkout_for_conformation() throws InterruptedException {
	    Thread.sleep(3000);
		click(co.getCheckout());
		
		click(co.getGuset_checkot());
		
	}
	Address ad=new Address(driver);
	@Given("user fill first name")
	public void user_fill_first_name() {
		sendkeys(ad.getFirstname(), "vignesh");
	  
	}

	@When("user enter the last name")
	public void user_enter_the_last_name() {
	   sendkeys(ad.getLastname(), "s");
	}
	
	@When("user fill email")
	public void user_fill_email() {
	    sendkeys(ad.getEmail(), "vickybasto99@gmail.com");
	}

	@When("user select country")
	public void user_select_country() {
	   DropDown_value(ad.getSelect_country(), "133");
	}

	@When("user enter city")
	public void user_enter_city() {
	    sendkeys(ad.getCity(), "theni");
	}

	@When("user enters the address")
	public void user_enters_the_address() {
	    sendkeys(ad.getAddress(), "32,poosari muthu pilllai street,kuchanur");
	}

	@When("user fill zip code")
	public void user_fill_zip_code() {
	  sendkeys(ad.getZipcode(), "625551");
	}

	@When("mobile number")
	public void mobile_number() {
	    sendkeys(ad.getPhonenumber(), "9600906161");
	}

	@When("user confrim the details")
	public void user_confrim_the_details() {
		click(ad.getContinue_button());
	    
	}

	@When("user select shipping method")
	public void user_select_shipping_method() {
		click(ad.getNextday_shipment());
		click(ad.getContinue_shippment());
	
	   
	}

	@When("user select payment method")
	public void user_select_payment_method() {
	    click(ad.getPayment_money());
	    click(ad.getPayment_continue());
	}

	@When("user check order details")
	public void user_check_order_details() {
		
		click(ad.getPaymentinfo());
	   
	}

	@Then("user confrim the order")
	public void user_confrim_the_order() {
		
		click(ad.getConfirm_order());
		
	}
	

	

}
