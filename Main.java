import adaptor.Adaptor;
import adaptor.LegacyPaymentGateway;
import builder.*;
import observer.Consumer;
import observer.MessageQueueTopic;

public class Main {
    public static void main(String[] args) {
        //Builder
//        MessageClient myclient = new MessageClient.Builder("localhost", 8080).
//                setTimeout(1000).setConsumer("tcs-banks").setSsl(false).
//                build();
//        System.out.print(myclient.getHost());

        //Adaptor
//       LegacyPaymentGateway lpg = new LegacyPaymentGateway();
//        Adaptor pg = new Adaptor(lpg,20,"IMPS");
//        pg.pay();

        //Observer

        Consumer observer1 = new Consumer("client1");
        Consumer observer2 = new Consumer("client2");
        Consumer observer3 = new Consumer("client3");
        Consumer observer4 = new Consumer("analytics");
        Consumer observer5 = new Consumer("client4");

        MessageQueueTopic iphone = new MessageQueueTopic();
        MessageQueueTopic samsung = new MessageQueueTopic();
        iphone.registerNode(observer1);
        iphone.registerNode(observer2);
        iphone.registerNode(observer4);
        samsung.registerNode(observer3);
        samsung.registerNode(observer5);
        iphone.unregisterNode(observer4);
        iphone.messagepush("Iphone");
        samsung.messagepush("Samsung");
    }
}