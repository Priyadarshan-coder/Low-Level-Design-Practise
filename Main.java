import adaptor.Adaptor;
import adaptor.LegacyPaymentGateway;
import builder.*;
public class Main {
    public static void main(String[] args) {
        //Builder
//        MessageClient myclient = new MessageClient.Builder("localhost", 8080).
//                setTimeout(1000).setConsumer("tcs-banks").setSsl(false).
//                build();
//        System.out.print(myclient.getHost());

        //Adaptor
        LegacyPaymentGateway lpg = new LegacyPaymentGateway();
        Adaptor pg = new Adaptor(lpg,20,"IMPS");
        pg.pay();
    }
}