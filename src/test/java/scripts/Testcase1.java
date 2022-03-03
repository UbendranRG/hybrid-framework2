package scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s= new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
		
		SkillraryDemoApp sd= new SkillraryDemoApp(driver);
		driverutilities.switchingTabs(driver);
		driverutilities.mouseHover(driver,sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtoCartPage ad= new AddtoCartPage(driver);
		driverutilities.doubleClick(driver,ad.getAddbtn());
		ad.addtocartbtn();
		driverutilities.alertPopup(driver);
	}
	
	
}


