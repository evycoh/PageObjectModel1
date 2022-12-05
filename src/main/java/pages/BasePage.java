package pages;

import driver.Driver;
import enums.WaitStrategy;
import explicit.ExplicitWaitFactory;
import logger.MyLogger;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reports.ExtentLogger;

import java.util.List;

public class BasePage extends Page{
    private static Logger log=MyLogger.getLogger(BasePage.class);
    @Override
    void sendKeys(By locator, String value, String elementName) {
        try{
            ExplicitWaitFactory.performExplicit(locator, WaitStrategy.VISIBLE).sendKeys(value);
            log.info("Sending Keys to "+elementName+" : "+value);
            ExtentLogger.pass("Sending Keys to "+elementName+":"+value);
        }catch (Exception e){
            e.printStackTrace();
            log.getLogger(getClass()).error("Failed to send Keys to "+elementName);
            ExtentLogger.fail("Failed to send keys to "+elementName);
        }
    }

    @Override
    void click(By locator, String elementName) {
        try{
            ExplicitWaitFactory.performExplicit(locator,WaitStrategy.CLICKABLE).click();
            log.info("Clicked on "+elementName);
            ExtentLogger.pass("Clicked on "+elementName);
        }catch (Exception e){
            e.printStackTrace();
            log.error("Failed to click on"+ elementName);
            ExtentLogger.fail("Failed to click on "+elementName);
        }
    }

    @Override
    void clearText(By locator, String elementName) {
        try{
            ExplicitWaitFactory.performExplicit(locator,WaitStrategy.VISIBLE).clear();
            log.info("Clearing Tet from "+elementName);
            ExtentLogger.pass("Clear Text from "+elementName);
        }catch (Exception e){
            e.printStackTrace();
            log.info("Failed to clear Text from "+elementName);
            ExtentLogger.fail("Failed to clear text from "+elementName);
        }
    }

    @Override
    String getText(By locator, String elementName) {
        try{
            String val= ExplicitWaitFactory.performExplicit(locator,WaitStrategy.VISIBLE).getText();
            log.info("Return Text from "+elementName+" : "+val);
            ExtentLogger.pass("Return Text from "+elementName+" With value: "+val);
            return val;
        }catch (Exception e){
            e.printStackTrace();
            log.error("Failed to Return Text from "+elementName);
            ExtentLogger.fail("Failed to return text from "+elementName);
            return null;
        }
    }

    @Override
    void selectElementFromBootStrapDropdown(By locator, String value, String elementName) {
        try{
            List<WebElement> list=Driver.getDriver().findElements(locator);
            for(WebElement element:list){
                if(element.getText().contains(value)){
                    ExtentLogger.pass("Select "+value+" From "+elementName);
                    log.info("Select "+value+" from "+elementName+" dropdown");
                    element.click();
                    break;
                }
            }
        }catch (Exception e){
            log.error("Failed to select Value from "+elementName +" dropdown");
            ExtentLogger.fail("Failed to select Value from "+elementName +" dropdown");
            e.printStackTrace();
        }
    }
}
