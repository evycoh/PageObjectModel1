package pages;

import org.openqa.selenium.By;

public class PaymentPage extends BasePage {

    public String getPayment(){
        String value=getText(By.cssSelector(".total-price>span"),"payment");
        String val=value.replace("₪","");
        return val;
    }

}
