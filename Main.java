import builder.*;
public class Main {
    public static void main(String[] args) {
        MessageClient myclient = new MessageClient.Builder("localhost", 8080).
                setTimeout(1000).setConsumer("tcs-banks").setSsl(false).
                build();
        System.out.print(myclient.getHost());
    }
}