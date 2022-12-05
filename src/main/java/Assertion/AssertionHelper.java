package Assertion;

import logger.MyLogger;
import org.apache.log4j.Logger;
import org.testng.Assert;
import reports.ExtentLogger;

public class AssertionHelper {
    private AssertionHelper(){}
    private static Logger log=MyLogger.getLogger(AssertionHelper.class);
    public static void verifyEquals(String m,String s){
        log.info("Verify if "+s+ "Equals with "+m);
        ExtentLogger.pass("Verify is "+s +" Equals With "+m);
        Assert.assertEquals(m,s);
    }
}
