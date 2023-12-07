package ListenersDemo;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener
{
	public void onTestFailure(ITestResult result) {
	System.out.println("Method failed"+ result.getName());

	}

	public void onTestSkipped(ITestResult result) {
	System.out.println("Method skipped"+ result.getName());

	}

	public void onTestStart(ITestResult result) {
	System.out.println("Method started and testcase details are"+ result.getName());

	}

	public void onTestSuccess(ITestResult result) {
	System.out.println("Method passed"+ result.getName());
	}
	
}
