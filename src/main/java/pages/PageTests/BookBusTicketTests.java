package pages.PageTests;

import org.testng.annotations.Test;

import pages.PageClasses.TestBase;

public class BookBusTicketTests extends TestBase {

	
	@Test
	public void BookBusticketForToday() throws InterruptedException{
		bookbus.Bookbusticket_Today();
	}
	
}
