package uk.co.bt.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements ConstantsForProject {
	public WebDriver driver;
	@BeforeMethod
	public void openWebsite()
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
		driver.get("https://www.openreach.co.uk/orpg/home/home.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@AfterMethod
	public void closeWebsite()
	{
		driver.quit();
	}
}
