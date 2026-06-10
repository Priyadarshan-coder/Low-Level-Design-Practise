package observer;

public class Consumer implements observerconsumer {
    String nodename;
    public Consumer(String nodename){
        this.nodename = nodename;
    }
    @Override
    public void update(String message){
        System.out.println("This is " +message+ " is processed by "+nodename);
    }
}
