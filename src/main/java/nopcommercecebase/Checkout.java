package nopcommercecebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	public static WebDriver driver;
	public Checkout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getGift_wraping() {
		return gift_wraping;
	}

	public WebElement getAgree_checkbox() {
		return agree_checkbox;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(xpath = "//select[@id='checkout_attribute_1']")
	private WebElement gift_wraping;
	
	@FindBy(xpath = "//div[@class='terms-of-service']")
	private WebElement agree_checkbox;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkout;
	
	@FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
	private WebElement guset_checkot;
	
	

	public WebElement getGuset_checkot() {
		return guset_checkot;
	}

}
