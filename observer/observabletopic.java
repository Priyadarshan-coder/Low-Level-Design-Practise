package observer;

public interface observabletopic {
    public void registerNode(Consumer consumer);
    public void  unregisterNode(Consumer consumer);
    public void notify(String message);
}
