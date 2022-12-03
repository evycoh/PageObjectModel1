package pages;

public class Pages {

    public static HomePage HomePage(){
        return new HomePage();
    }
    public static SearchResultPage SearchResultPage(){
        return new SearchResultPage();
    }
    public static GiftCardPage GiftCardPage(){
        return new GiftCardPage();
    }
    public static WhoToSendPage WhoToSendPage(){
        return new WhoToSendPage();
    }
    public static HowToSendPage HowToSendPage(){
        return new HowToSendPage();
    }
    public static LoginPage LoginPage(){
        return new LoginPage();
    }
    public static  PaymentPage PaymentPage(){
        return new PaymentPage();
    }

}
