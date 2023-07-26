package nopcommerce.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	
	@RunWith(Cucumber.class)
	@CucumberOptions(features ="src\\test\\java\\com\\feature\\Booklaptop.feature",
	glue="BookLaptop"
			
			
			)
	public class runner {
		
		public static WebDriver driver;
		@BeforeClass
		public static void launch() {
			
			ChromeOptions op = new ChromeOptions();
			op.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(op);
			
		}
		@AfterClass
		public static void close() {
			
			System.out.println("testing sucessfully");
		}
		
		
	
}
