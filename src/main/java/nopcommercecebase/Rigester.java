package nopcommercecebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rigester {
public static WebDriver driver;
@FindBy(xpath = "//a[normalize-space()='Register']")
private WebElement rigister;

@FindBy(xpath = "//input[@id='gender-male']")
private WebElement male_button;

@FindBy(xpath = "//input[@id='gender-female']")
private WebElement female_button;
 
@FindBy(xpath = "//input[@id='FirstName']")
private WebElement firstname;

@FindBy(xpath = "//input[@id='LastName']")
private WebElement lastname;

@FindBy(xpath = "//select[@name='DateOfBirthDay']")
private WebElement dob_date;

@FindBy(xpath = "//select[@name='DateOfBirthMonth']")
private WebElement dob_month;

@FindBy(xpath = "//select[@name='DateOfBirthYear']")
private WebElement dob_year;

@FindBy(xpath = "//input[@id='Email']")
private WebElement email;

@FindBy(xpath = "//input[@id='Newsletter']")
private WebElement checkbox;

@FindBy(xpath = "//input[@id='Password']")
private WebElement password;

@FindBy(xpath = "//input[@id='ConfirmPassword']")
private WebElement confrim_password;

@FindBy(xpath = "//button[@id='register-button']")
private WebElement Register;

@FindBy(xpath = "//a[normalize-space()='Log in']")
private WebElement login;

public static WebDriver getDriver() {
	return driver;
}

public WebElement getRigister() {
	return rigister;
}

public WebElement getLogin() {
	return login;
}

public Rigester(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public WebElement getRig() {
	return rigister;
}

public WebElement getMale_button() {
	return male_button;
}

public WebElement getFemale_button() {
	return female_button;
}

public WebElement getFirstname() {
	return firstname;
}

public WebElement getLastname() {
	return lastname;
}

public WebElement getDob_date() {
	return dob_date;
}

public WebElement getDob_month() {
	return dob_month;
}

public WebElement getDob_year() {
	return dob_year;
}

public WebElement getEmail() {
	return email;
}

public WebElement getCheckbox() {
	return checkbox;
}

public WebElement getPassword() {
	return password;
}

public WebElement getConfrim_password() {
	return confrim_password;
}

public WebElement getRegister() {
	return Register;
}




	
}
