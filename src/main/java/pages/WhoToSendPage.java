package pages;

import driver.Driver;
import org.openqa.selenium.By;

public class WhoToSendPage extends BasePage {

    public WhoToSendPage setReceiveGiftCardName(String name){
        sendKeys(By.cssSelector("input[type='text']"),name,"Receiver name");
        return this;
    }
    public WhoToSendPage selectBlessFromDropdown(String bless){
        click(By.cssSelector(".selected-name"),"Bless dropdown");
        selectElementFromBootStrapDropdown(By.cssSelector(".selected-name+.dropdown span"),bless,"Bless dropdown");
        return this;
    }
    public WhoToSendPage setCustomBlessing(String value){
        clearText(By.cssSelector("textarea[data-parsley-group]"),"Custom bless input");
        sendKeys(By.cssSelector("textarea[data-parsley-group]"),value,"custom bless input");
        return this;
    }
    public WhoToSendPage setPhotoPath(String photoPath){
        Driver.getDriver().findElement(By.name("logo")).sendKeys(photoPath);
        return this;
    }
    public WhoToSendPage clickContinueButton(){
        click(By.cssSelector("button[type='submit']"),"continueBtn");
        return this;
    }
}
