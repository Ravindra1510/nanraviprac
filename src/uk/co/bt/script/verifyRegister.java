package uk.co.bt.script;

import org.testng.annotations.Test;

import uk.co.bt.generic.BaseTest;
import uk.co.bt.pom.NewRegisterPage;



public class verifyRegister extends BaseTest {
	
	@Test
	public void testVerifyRegister()
	{
		NewRegisterPage np= new NewRegisterPage();
		np.clickonNewUser();
	}
	
	

}
