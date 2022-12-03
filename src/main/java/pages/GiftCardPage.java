package pages;

import org.openqa.selenium.By;

public class GiftCardPage extends BasePage {

    public GiftCardPage setGiftCardAmount(String amount){
        sendKeys(By.cssSelector("input[type='tel']"),amount,"amount");
        return this;
    }
    public GiftCardPage clickContinueButton(){
        click(By.cssSelector(".money-input+.money-btn>button"),"money");
        return this;
    }
}
