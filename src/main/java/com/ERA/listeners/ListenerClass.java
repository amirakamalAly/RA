package com.ERA.listeners;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ERA.base.Action;
import com.ERA.base.BaseClass;
import com.ERA.utils.ExtentManager;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class ListenerClass extends ExtentManager implements ITestListener {

	Action action = new Action();

	public void onTestStart(ITestResult result) {
		logger = extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			String imgPath = action.screenShot(BaseClass.getDriver(), result.getName());
			logger.log(Status.PASS, "Pass Test case is: " + result.getName());
		//	logger.log(Status.PASS, "ScreenShot is Attached to" + result.getName());
			try {
				// logger.pass("ScreenShot is Attached",
				// MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
			System.out.println( "pass to "+result.getName());

				logger.addScreenCaptureFromPath(imgPath, "ScreenShot is Attached");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void onTestFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			try {
				logger.log(Status.FAIL,
						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				logger.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
				String imgPath = action.screenShot(BaseClass.getDriver(), result.getName());

				System.out.println( "fail to "+result.getName());
				logger.log(Status.FAIL, "ScreenShot is Attached to" + result.getName());
				logger.addScreenCaptureFromPath(imgPath, "ScreenShot is Attached");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void onTestSkipped(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			String imgPath = action.screenShot(BaseClass.getDriver(), result.getName());
			logger.log(Status.SKIP, "Skipped Test case is: " + result.getName());
			try {
				logger.skip("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
				logger.log(Status.SKIP, "ScreenShot is Attached to" + result.getName());
				logger.addScreenCaptureFromPath(imgPath, "ScreenShot is Attached");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void onTestSuccessMobile(ITestResult result, String fullpath) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			// String imgPath = action.screenShot(BaseClass.getDriver(), result.getName());
			//logger.log(Status.PASS, "Test case is passed " + result.getName());
			// logger.log(Status.PASS, "ScreenShot is Attached to" + result.getName());
			try {
				logger.addScreenCaptureFromPath(fullpath, "Test case is passed and ScreenShot is Attached");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void onTestFailureMobile(ITestResult result, String fullpath) {
		// TODO Auto-generated method stub
		if (result.getStatus() == ITestResult.FAILURE) {
			try {
//				logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				logger.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + "Test Case Failed", ExtentColor.RED));
				//logger.log(Status.FAIL, "ScreenShot is Attached to" + result.getName());
				logger.addScreenCaptureFromPath(fullpath, "Test Case Failed and ScreenShot is Attached");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void onTestSkippedMobile(ITestResult result, String fullpath) {
		if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP, "Skipped Test case is: " + result.getName());
			try {
				logger.skip("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(fullpath).build());
				logger.addScreenCaptureFromPath(fullpath, "ScreenShot is Attached");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}



	public void onTestStartmobile(Method method) {
		logger = extent.createTest(method.getName());
	}
}
