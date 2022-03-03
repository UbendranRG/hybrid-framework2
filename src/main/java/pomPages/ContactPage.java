package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {

	@FindBy(name="name")
	private WebElement fullname;
	@FindBy(name="sender")
	private WebElement email;
	@FindBy(name="subject")
	private WebElement subject;
	@FindBy(name="message")
	private WebElement message;
	@FindBy(xpath="//button[text()='Send us mail']")
	private WebElement sendus;
	
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void sendmail()
	{
		sendus.click();
	}
	
}

