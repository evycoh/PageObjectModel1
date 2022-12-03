package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public LoginPage setEmail(String email){
        sendKeys(By.cssSelector(".option.oldschool input[type='email']"),email,"email");
        return this;
    }
    public LoginPage setPassword(String password){
        sendKeys(By.cssSelector(".option.oldschool input[type='password']"),password,"password");
        return this;
    }
    public LoginPage clickLogin(){
        click(By.cssSelector(".option.oldschool button"),"loginBtn");
        return this;
    }
}
