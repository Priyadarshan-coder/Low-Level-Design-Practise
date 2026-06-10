package observer;

import java.util.ArrayList;

public class MessageQueueTopic implements observabletopic{
    ArrayList<Consumer> cs = new ArrayList<>();
    @Override
    public void registerNode(Consumer consumer){
        cs.add(consumer);
    }
    public void unregisterNode(Consumer consumer){
        cs.remove(consumer);
    }
    public void notify(String message){
        for(Consumer it: cs)
        {
            it.update(message);
        }
    }
    public void messagepush(String message)
    {
        notify(message);
    }
}
