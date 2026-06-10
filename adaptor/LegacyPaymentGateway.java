package adaptor;

public class LegacyPaymentGateway {
    public void payment(int rupees, String instrument){
        System.out.println("Payment of "+ rupees +" rupees has been processed using  "+instrument +" method.");
    }
}
