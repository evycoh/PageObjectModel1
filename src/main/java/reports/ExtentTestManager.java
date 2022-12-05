package reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {

    private ExtentTestManager(){}

    private static ExtentTest test;

    public static void setExtentTest(ExtentTest extentTest){
        test=extentTest;
    }
    public static ExtentTest getExtentTest(){
        return test;
    }
}
