package pages;

import org.openqa.selenium.By;

public abstract class Page {
    abstract void sendKeys(By locator, String value, String elementName);
    abstract void click(By locator,String elementName);
    abstract void clearText(By locator,String elementName);

    abstract String getText(By locator,String elementName);
    abstract void selectElementFromBootStrapDropdown(By locator,String value,String elementName);
}
