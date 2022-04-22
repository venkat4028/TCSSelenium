package pages.PageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

import pages.Utility.CustomizedMethods;

public class TestBase {

	public static ChromeDriver driver;
	public static WebDriverWait wait;
	public static Elements EL;
	public static CustomizedMethods CM;
	public static HomepageValidations Homepage;
	public static Bookbusticket bookbus;
	@BeforeSuite
	public void Setup(){
		
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	wait=new WebDriverWait(driver, 30);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
	EL = new Elements();
	CM = new CustomizedMethods();
	Homepage = new HomepageValidations();
	bookbus = new Bookbusticket();
	}
	
}
