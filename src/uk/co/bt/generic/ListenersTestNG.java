package uk.co.bt.generic;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersTestNG implements ITestListener {

	

	@Override
	public void onTestFailure(ITestResult result) {

		SimpleDateFormat f1= new SimpleDateFormat("dd-MM-YYYY-hh-mm-ss" );
		String  d = f1.format(new Date());
	
		Reporter.log("Test "+ result.getName() + " failed at " + d ,true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		SimpleDateFormat f1= new SimpleDateFormat("dd-MM-YYYY-hh-mm-ss" );
		String  d = f1.format(new Date());
		// TODO Auto-generated method stub
		Reporter.log("Test "+ result.getName() + " skipped at " + d,true );
	}

	@Override
	public void onTestStart(ITestResult result) {
		SimpleDateFormat f1= new SimpleDateFormat("dd-MM-YYYY-hh-mm-ss" );
		String  d = f1.format(new Date());
		// TODO Auto-generated method stub
		Reporter.log("Test "+ result.getName() + " started at" + d ,true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		SimpleDateFormat f1= new SimpleDateFormat("dd-MM-YYYY-hh-mm-ss" );
		String  d = f1.format(new Date());
		// TODO Auto-generated method stub
		Reporter.log("Test "+ result.getName() + " succededed at " + d ,true    );
	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext result) {
		SimpleDateFormat f1= new SimpleDateFormat("dd-MM-YYYY-hh-mm-ss" );
		String  d = f1.format(new Date());
		// TODO Auto-generated method stub
		Reporter.log("Test "+ result.getName() + "started at" + d +"",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
