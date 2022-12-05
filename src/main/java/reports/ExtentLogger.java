package reports;

public class ExtentLogger {

    public static void pass(String m) {
        ExtentTestManager.getExtentTest().pass(m);
    }
    public static void fail(String m){
        ExtentTestManager.getExtentTest().fail(m);
    }
    public static void skip(String m){
        ExtentTestManager.getExtentTest().skip(m);
    }

}
