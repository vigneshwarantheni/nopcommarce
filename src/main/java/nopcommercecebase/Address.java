package nopcommercecebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	
	public static WebDriver driver;
	@FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
	private WebElement Lastname;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
	private WebElement email;
	
	@FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
	private WebElement select_country;

	public Address(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSelect_country() {
		return select_country;
	}

	public WebElement getSelect_state() {
		return select_state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getFaxnum() {
		return faxnum;
	}

	public WebElement getContinue_button() {
		return continue_button;
	}

	public WebElement getGroud_shipment() {
		return groud_shipment;
	}

	public WebElement getNextday_shipment() {
		return nextday_shipment;
	}

	public WebElement getTwoday_shipment() {
		return twoday_shipment;
	}

	public WebElement getContinue_shippment() {
		return continue_shippment;
	}

	public WebElement getPayment_money() {
		return payment_money;
	}

	public WebElement getPayment_card() {
		return payment_card;
	}

	public WebElement getPayment_continue() {
		return payment_continue;
	}

	public WebElement getPaymentinfo() {
		return paymentinfo;
	}

	public WebElement getConfirm_order() {
		return confirm_order;
	}

	public WebElement getOrder_details() {
		return order_details;
	}

	@FindBy(xpath = "//select[@id='BillingNewAddress_StateProvinceId']")
	private WebElement  select_state;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_City']")
	private WebElement city;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
	private WebElement  address;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
	private WebElement zipcode;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
	private WebElement phonenumber;
	
	@FindBy(xpath = "//input[@id='BillingNewAddress_FaxNumber']")
	private WebElement faxnum;
	
	@FindBy(xpath = "//button[@onclick='Billing.save()']")
	private WebElement continue_button;
	
	@FindBy(xpath = "//input[@id='shippingoption_0']")
	private WebElement groud_shipment;
	
	@FindBy(xpath = "//input[@id='shippingoption_1']")
	private WebElement nextday_shipment;
	
	@FindBy(xpath = "//input[@id='shippingoption_2']")
	private WebElement twoday_shipment;
	
	@FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
	private WebElement continue_shippment;
	
	@FindBy(xpath = "//input[@id='paymentmethod_0']")
	private WebElement payment_money;
	
	@FindBy(xpath = "//input[@id='paymentmethod_1']")
	private WebElement payment_card;
	
	@FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
	private WebElement payment_continue;
	
	@FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
	private WebElement paymentinfo;
	
	@FindBy(xpath = "//button[normalize-space()='Confirm']")
	private WebElement confirm_order;
	
	@FindBy(xpath = "//a[normalize-space()='Click here for order details.']")
	private WebElement order_details;
	
	
	
}
