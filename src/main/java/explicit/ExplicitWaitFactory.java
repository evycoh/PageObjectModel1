package explicit;

import driver.Driver;
import enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitFactory {
    private ExplicitWaitFactory(){}

    public static WebElement performExplicit(By locator, WaitStrategy waitStrategy){
        WebElement element=null;
        if(waitStrategy==WaitStrategy.VISIBLE){
            element=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        else if(waitStrategy==WaitStrategy.CLICKABLE){
            element=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(locator));
        }
        else if(waitStrategy==WaitStrategy.PRESENCE){
            element=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        else if(waitStrategy==WaitStrategy.NONE){
            element=Driver.getDriver().findElement(locator);
        }
        return element;
    }
}
