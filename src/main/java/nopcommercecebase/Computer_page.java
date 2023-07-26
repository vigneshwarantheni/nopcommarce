package nopcommercecebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer_page {
	
	public static WebDriver driver;
	@FindBy(xpath  = "//img[@title='Show details for Apple MacBook Pro 13-inch']")
	private WebElement apple;
	
	@FindBy(xpath = "//body[1]/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
	private WebElement Asus;
	
	@FindBy(xpath = "//a[normalize-space()='HP Envy 6-1180ca 15.6-Inch Sleekbook']")
	private WebElement hp;
	
	@FindBy(xpath = "//a[normalize-space()='HP Spectre XT Pro UltraBook']")
	private WebElement Hp_ultra;
	
	@FindBy(xpath="//a[normalize-space()='Lenovo Thinkpad X1 Carbon Laptop']")
	private WebElement lenova;
	
	@FindBy(xpath = "//a[normalize-space()='Samsung Series 9 NP900X4C Premium Ultrabook']")
	private WebElement samsung;
	
	@FindBy(xpath = "//a[normalize-space()='List']")
	private WebElement listview;

	public Computer_page(WebDriver driver) {
		this.driver=driver;
	     PageFactory.initElements(driver, this);
	}

	public WebElement getApple() {
		return apple;
	}

	public WebElement getAsus() {
		return Asus;
	}

	public WebElement getHp() {
		return hp;
	}

	public WebElement getHp_ultra() {
		return Hp_ultra;
	}

	public WebElement getLenova() {
		return lenova;
	}

	public WebElement getSamsung() {
		return samsung;
	}

	public WebElement getListview() {
		return listview;
	}
	
	
	

}
