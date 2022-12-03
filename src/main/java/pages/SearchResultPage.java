package pages;

import org.openqa.selenium.By;

public class SearchResultPage extends BasePage{
    private final String giftCardName="//span[@class='name bm-subtitle-1'][text()='%value%']";

    public SearchResultPage selectGiftCardByName(String name){
        String value=giftCardName.replace("%value%",name);
        click(By.xpath(value),"GiftCard: "+name);
        return this;
    }


}
