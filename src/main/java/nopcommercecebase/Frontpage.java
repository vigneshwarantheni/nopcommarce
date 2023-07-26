package nopcommercecebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frontpage {
	
	
	public static WebDriver driver;
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
	private WebElement computers;
	
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
	private WebElement desktop_com;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
	private WebElement notebook_com;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")
	private WebElement software_com;
	
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
	private WebElement electronics;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Camera & photo']")
	private WebElement camera_elect;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
	private WebElement cellphone_elect;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Others']")
	private WebElement other_elect;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
	private WebElement Apparel;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Shoes']")
	private WebElement shoes_Apparel;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Clothing']")
	private WebElement clothing_Apparel;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Accessories']")
	private WebElement Accessories;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
	private WebElement digital_downloads;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
	private WebElement  Books;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
	private WebElement  jewelry;
	
	@FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
	private WebElement giftcards ;
	
	@FindBy(xpath="//input[@id='small-searchterms']")
	private WebElement Search;
	
	@FindBy(xpath = "//button[normalize-space()='Search']")
	private WebElement Search_button;

	public Frontpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getDesktop_com() {
		return desktop_com;
	}

	public WebElement getNotebook_com() {
		return notebook_com;
	}

	public WebElement getSoftware_com() {
		return software_com;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getCamera_elect() {
		return camera_elect;
	}

	public WebElement getCellphone_elect() {
		return cellphone_elect;
	}

	public WebElement getOther_elect() {
		return other_elect;
	}

	public WebElement getApparel() {
		return Apparel;
	}

	public WebElement getShoes_Apparel() {
		return shoes_Apparel;
	}

	public WebElement getClothing_Apparel() {
		return clothing_Apparel;
	}

	public WebElement getAccessories() {
		return Accessories;
	}

	public WebElement getDigital_downloads() {
		return digital_downloads;
	}

	public WebElement getBooks() {
		return Books;
	}

	public WebElement getJewelry() {
		return jewelry;
	}

	public WebElement getGiftcards() {
		return giftcards;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getSearch_button() {
		return Search_button;
	}
	
	
	
	
	
	
	
	
	
	

}
