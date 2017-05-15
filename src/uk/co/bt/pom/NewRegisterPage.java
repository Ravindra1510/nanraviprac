package uk.co.bt.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRegisterPage {
	
	@FindBy(xpath="//a[.='New user?']")
	private WebElement newUser;
	
	

	public void clickonNewUser()
	{
		newUser.click();
	}

}
