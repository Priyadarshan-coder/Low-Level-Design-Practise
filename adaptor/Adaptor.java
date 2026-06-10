package adaptor;

public class Adaptor implements PaymentProcessor {
    LegacyPaymentGateway legacyPaymentGateway;
    int dollars;
    String instrument;
    public Adaptor(LegacyPaymentGateway legacyPaymentGateway, int dollars, String instrument){
        this.legacyPaymentGateway = legacyPaymentGateway;
        this.dollars = dollars;
        this.instrument = instrument;
    }
    @Override
    public void pay() {
        int rupees = dollars*90;
        legacyPaymentGateway.payment(rupees, instrument);
    }
}
