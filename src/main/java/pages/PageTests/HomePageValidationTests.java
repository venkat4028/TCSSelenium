package pages.PageTests;

import org.testng.annotations.Test;

import pages.PageClasses.TestBase;

public class HomePageValidationTests extends TestBase {

	@Test
	public void HomePageHeaderMenusValidation(){
		Homepage.ValidateHeaderMenus();
	}
	
	@Test
	public void FooterMenusValidations() throws InterruptedException{
		Homepage.FooterMenuValidations();
	}
}
