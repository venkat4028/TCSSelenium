package pages.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomepageValidations extends TestBase {

	
	public void ValidateHeaderMenus(){
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EL.eleMenuBusTickets_XP)));
		CM.CheckElementDisplayedbyXpath(EL.eleRedBusLogo_XP, "Red Bus Logo");
		CM.CheckElementDisplayedbyXpath(EL.eleMenuBusTickets_XP, "Bus Tickets Menu");		
		driver.close();
	}
	
	public void FooterMenuValidations() throws InterruptedException{
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		CM.scrolltoElementByXpath(EL.eleTopBusses_XP);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EL.eleTopBusses_XP)));
		CM.CheckElementDisplayedbyXpath(EL.eleTopBusses_XP, "Top Bus Routes");
		CM.CheckElementDisplayedbyXpath(EL.eleTempoTravellerAhmadabad_XP, "Travvelers in Ahmadabad");

	}
	
}
