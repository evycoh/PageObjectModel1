package testcases;


import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class TestBase {
    @BeforeMethod
    public void setup(){
         Driver.setDriver();
    }
    @AfterMethod
    public void tearDown(){
       Driver.quitDriver();
    }


}
