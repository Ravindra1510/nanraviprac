package uk.co.bt.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void testA()
	{Assert.fail();
		Reporter.log("welcomeBT",true);
	}
}