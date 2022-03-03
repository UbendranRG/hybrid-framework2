package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		
		Point loc = s.getContact().getLocation();
		int x=loc.getX();
		int y=loc.getY();
		driverutilities.scrollBar(driver,x, y);
		Thread.sleep(5000);
		s.contactus();
		driver.get(pdata.getPropertyData("fullname"));
		driver.get(pdata.getPropertyData("email"));
		driver.get(pdata.getPropertyData("subject"));
		driver.get(pdata.getPropertyData("mesaage"));
	}

}
