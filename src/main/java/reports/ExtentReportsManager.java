package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ExtentReportsManager {
    private ExtentReportsManager(){}
    private static ExtentReports extent=null;
    public static ExtentReports getInstance(){
        if(Objects.isNull(extent)){
            extent=createInstance();
        }return extent;
    }
    public static ExtentReports createInstance(){
        extent=new ExtentReports();
        ExtentSparkReporter spark=new ExtentSparkReporter("output/report.html");
        spark.config().setTheme(Theme.DARK);
        spark.config().setDocumentTitle("BuyMe");
        spark.config().setReportName("BuyMe_EndToEnd");
        extent.attachReporter(spark);
        return extent;
    }
    public static void createTest(String testName){
        ExtentTest test=extent.createTest(testName);
       ExtentTestManager.setExtentTest(test);
    }

    public static void flushReport(){
        if(Objects.nonNull(extent)){
            extent.flush();
            try {
                Desktop.getDesktop().browse(new File("output/report.html").toURI());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
