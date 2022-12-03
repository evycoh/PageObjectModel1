package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Objects;

public class Driver {
    private Driver(){}
    private static WebDriver driver=null;

    public static void setDriver(){
        if(Objects.isNull(driver)){
            driver=WebDriverManager.chromedriver().create();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver.manage().window().maximize();
            driver.get("https://buyme.co.il/");
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }
    public static void quitDriver(){
        driver.quit();
        driver=null;
    }

}
