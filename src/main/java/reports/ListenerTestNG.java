package reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;

public class ListenerTestNG implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
       ExtentReportsManager.getInstance();
    }

    @Override
    public void onTestStart(ITestResult result) {
        String methodName = result.getMethod().getMethodName();
        ExtentReportsManager.createTest(methodName);

    }


    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getMethod().getMethodName()+" Pass");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getMethodName() + "Fail");
        ExtentTestManager.getExtentTest().fail(MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Img()).build());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName() + " Skipped");
        ExtentTestManager.getExtentTest().skip(MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Img()).build());

    }
    @Override
    public void onFinish(ITestContext context) {
        ExtentReportsManager.flushReport();
    }

}
