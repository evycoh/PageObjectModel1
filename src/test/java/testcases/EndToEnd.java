package testcases;

import Assertion.AssertionHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Pages;

public class EndToEnd extends TestBase {

    @Test
    public void tc_EndToEnd()  {
        Pages.HomePage()
//                closePopupAdd().
                .setAmount("200")
                .setArea("דרום")
                .setCategory("שף")
                .clickSearchGiftButton();
        Pages.SearchResultPage().selectGiftCardByName("מסעדת אברטו Aberto");
        Pages.GiftCardPage().setGiftCardAmount("123").clickContinueButton();
        Pages.WhoToSendPage().
                setReceiveGiftCardName("myFriend").selectBlessFromDropdown("תודה").
                setCustomBlessing("מזל טוב והמון תודה")
                .setPhotoPath(System.getProperty("user.dir")+"/src/main/resources/cat.png").
                clickContinueButton();
        Pages.HowToSendPage().
                clickSendGiftCardLater().
                setGiftCardDate("יולי", "8").
                setHour("11:15").
                selectSendGiftByEmail("myEmail@xyz.com").
                setSenderGiftCardName("me").
                clickContinueBtn();
        Pages.LoginPage().
                setEmail("userEmail1@xyz.com").setPassword("a1b1c1d1X").clickLogin();
        AssertionHelper.verifyEquals(Pages.PaymentPage().getPayment(),"123");

    }
}
