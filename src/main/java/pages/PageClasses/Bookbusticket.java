package pages.PageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Bookbusticket extends TestBase{

	public void Bookbusticket_Today() throws InterruptedException{
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(EL.eleMenuBusTickets_XP)));
		
		CM.enteringDataintoTextfiledByXpath("//label[text()='FROM']/parent::div/input", "Rajampet", "From Location : Rajampet");
		CM.clickonElementbyXpath("//li[contains(text(),'Rajampet')]", "Rajampet");
		
		CM.enteringDataintoTextfiledByXpath("//label[text()='TO']/parent::div/input", "Bangalore (All Locations)", "To Location : Bangalore (All Locations)");
		CM.clickonElementbyXpath("//li[contains(text(),'Bangalore')]", "Bangalore");

		CM.clickonElementbyXpath("//label[text()='Date']/parent::div/input", "Date");
		Thread.sleep(500);
		CM.clickonElementbyXpath("//td[@class='current day']", "Current Day");
		
		CM.clickonElementbyXpath("//button[text()='Search Buses']", "Search Buses");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='All bus ratings include safety as a major factor']")));
		
		List<WebElement> travels=driver.findElements(By.xpath("//div[contains(@class,'travels')]"));
		System.out.println("The Available Travels are :");
		for(int i=0;i<travels.size();i++){
			System.out.println(travels.get(i).getText());
		}
		
	}
	
}
