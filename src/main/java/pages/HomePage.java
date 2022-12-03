package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage closePopupAdd(){
        click(By.cssSelector("button[autofocusable]"),"popupAdd");
        return this;
    }
    public HomePage setAmount(String amount){
        click(By.cssSelector("form>label:first-of-type .selected-name"),"amount dropdown button");
        selectElementFromBootStrapDropdown(By.cssSelector("form>label:first-of-type li>span"),amount,"amount dropdown");
        return this;
    }
    public HomePage setArea(String area){
        click(By.cssSelector("form>label:nth-of-type(2) .selected-text"),"Area dropdown button");
        selectElementFromBootStrapDropdown(By.cssSelector("form>label:nth-of-type(2) li>span"),area,"area dropdown");
        return this;
    }
    public HomePage setCategory(String category){
        click(By.cssSelector("form>label:nth-of-type(3) .selected-text"),"Category dropdown button");
        selectElementFromBootStrapDropdown(By.cssSelector("form>label:nth-of-type(3) li>span"),category,"category dropdown");
        return this;
    }
    public SearchResultPage clickSearchGiftButton(){
        click(By.cssSelector("a[rel='nofollow']"),"search gift button");
        return new SearchResultPage();
    }

}
