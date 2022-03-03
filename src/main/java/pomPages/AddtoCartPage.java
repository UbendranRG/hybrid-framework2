package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {

	@FindBy(id="add")
	private WebElement addbtn;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement cartbtn;
	
	public AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void addtocartbtn()
	{
		cartbtn.click();
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
}
