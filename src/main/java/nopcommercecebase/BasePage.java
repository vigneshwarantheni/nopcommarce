 package nopcommercecebase;



	

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.InputEvent;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;

	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import com.google.common.io.Files;

	public class BasePage {

		
		public static void get( WebDriver d ,String str) {
		
			d.get(str);
			
		}
		
		public static void maximaize(WebDriver d) {
			
			d.manage().window().maximize();
			
		}
		
		 public static void close(WebDriver d) {
			 d.close();
			
		}
		  public static void tittle(WebDriver d) {
			 
			 String title = d.getTitle();
			 System.out.println(title);
			 
		}
		  public static void geturl(WebDriver d) {
			 String currentUrl = d.getCurrentUrl();
			 System.out.println(currentUrl);
			
		}
		 public static void pagesource(WebDriver d) {
			 String pageSource = d.getPageSource();
			 System.out.println(pageSource);
			
		}
		 public static void switchto(WebDriver d) {
			
			 d.switchTo();
		}
		 
		 public static void movetoelemant(WebElement e, WebDriver d) {
			 Actions ac=new Actions(d);
			 ac.moveToElement(e).build().perform();
			 
			 
		 }
		 
		 public static void quit(WebDriver d) {
			 d.quit();
			
		}
		 public static void navigate(WebDriver d) {
			 d.navigate();
			
		}
		 public static void click(WebElement element) {
			 element.click();
			
		}
		 
		 public static void clear(WebElement ele) {
			 ele.clear();
				
		}
		 public void submit(WebElement ele) {
			 ele.submit();
			
		}
		 public static void getattripute(WebElement ele) {
			 
			 ele.getAttribute("value");
			 	
		}
		 public static void sendkeys(WebElement ele,String s) {
			 
			 ele.sendKeys(s);
			
		}
		 public static void enterkey(WebElement e) {
			 e.sendKeys(Keys.ENTER);
			
		}
		 public static void size(WebElement el) {
			 Dimension size = el.getSize();
			 System.out.println(size);
			
		}
		 
		 public static boolean isdisply(WebElement ele) {
			 
			 boolean displayed = ele.isDisplayed();
			 return displayed;	
		}
		 
		 public static void DropDown_value(WebElement ele, String op) {
			 
			 Select opj=new Select(ele);
			 opj.selectByValue(op);

			 
		 }
		 
		 public static void DropDown_visibletxt(WebElement str,String e) {
			 Select sc=new Select(str);
			 sc.selectByVisibleText(e);
			
			
		}
		 
		 
		 public static void DropDown_index(WebElement ele,int i) {
			 Select sc=new Select(ele);
			 sc.selectByIndex(i);
			 
			
		}
		 public static void DragAndDrop(WebDriver d,WebElement e1,WebElement e2) {
			 
			 Actions ac=new Actions(d);
			 ac.dragAndDrop(e1, e2).perform();	
		}
		 
		 public static void screenshot(WebDriver d,String s) {
				TakesScreenshot ts=(TakesScreenshot)d;
				 File src=ts.getScreenshotAs(OutputType.FILE);
				try {
					Files.copy(src, new File(s));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		 //key press
		 public static void keypress() throws AWTException {
			 Robot robot=new Robot();
			 robot.keyPress(KeyEvent.VK_DOWN);
			 robot.keyRelease(KeyEvent.VK_DOWN);
			
		}
		 //mouse press
		 public static void mousepress() throws AWTException {
			 Robot robt=new Robot();
			 robt.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			 robt.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);	 
			
		}
		 public static void alert_accept(WebDriver d) {
			 
			 d.switchTo().alert().accept();
			 
			
		}
		 public static void alert_cancel(WebDriver d) {
			 d.switchTo().alert().dismiss();
			 
		 }
		 

	}


