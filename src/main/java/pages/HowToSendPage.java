package pages;

import driver.Driver;
import org.openqa.selenium.By;

public class HowToSendPage extends BasePage{

    public HowToSendPage clickSendGiftCardLater(){
        click(By.cssSelector(".button-later"),"Later Button");
        return this;
    }
    public HowToSendPage setGiftCardDate(String month,String day){
        click(By.id("calendar"),"Calender");
        while(true){
            String m=getText(By.cssSelector(".selected-month-name"),"MonthDateValue");
            if(m.equalsIgnoreCase(month)){
                break;
            }
            else{
                Driver.getDriver().findElement(By.cssSelector(".calendar-top>span:last-of-type #chevron-left")).click();
            }
        }
        selectElementFromBootStrapDropdown(By.cssSelector("span[class*='bm-date-day']:not([class*='disabled']) "),day,"day");
     return this;
    }
    public HowToSendPage setHour(String hour){
        click(By.cssSelector(".selected-name"),"date dropdown");
        selectElementFromBootStrapDropdown(By.cssSelector(".selected-name+.dropdown span"),hour,"hour");
        return this;
    }
    public HowToSendPage selectSendGiftByEmail(String email){
        click(By.cssSelector("svg[gtm='method-email']"),"email button");
        sendKeys(By.id("email"),email,"email input");
        return this;
    }
    public HowToSendPage setSenderGiftCardName(String name){
        sendKeys(By.cssSelector("input[maxlength]"),name,"name");
        return this;
    }
    public HowToSendPage clickContinueBtn(){
        click(By.cssSelector("button[type='submit']"),"Continue btn");
        return this;
    }

}
