package nopcommercecebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Cart {
	public static WebDriver driver;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-7']")
	private WebElement HPultra_addtocart;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-4']")
	private WebElement Apple_addtocart;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-9']")
	private WebElement Lenovo_addtocart;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-5']")
	private WebElement Asus_addtocart;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-6']")
	private WebElement Samsung_addtocart;
	
	@FindBy(xpath = "//button[@id='add-to-cart-button-8']")
	private WebElement HP_addtocart;
	
	@FindBy(xpath = "//img[@alt='nopCommerce demo store']")
	private WebElement Home_button;
	
	@FindBy(xpath = "//a[normalize-space()='Shopping cart']")
	private WebElement cart_button;
	
	@FindBy(xpath = "//span[@title='Close']")
	private WebElement close_popup;

	public WebElement getClose_popup() {
		return close_popup;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCart_button() {
		return cart_button;
	}

	public Add_Cart(WebDriver driver) {
		this .driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getHPultra_addtocart() {
		return HPultra_addtocart;
	}

	public WebElement getApple_addtocart() {
		return Apple_addtocart;
	}

	public WebElement getLenovo_addtocart() {
		return Lenovo_addtocart;
	}

	public WebElement getAsus_addtocart() {
		return Asus_addtocart;
	}

	public WebElement getSamsung_addtocart() {
		return Samsung_addtocart;
	}

	public WebElement getHP_addtocart() {
		return HP_addtocart;
	}

	public WebElement getHome_button() {
		return Home_button;
	}

}
