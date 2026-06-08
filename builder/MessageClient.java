package builder;
public class MessageClient {
    private final String host;
    private final int port;
    private final Boolean enablessl;
    private final int timeout;
    private final String consumergroup;
    private MessageClient(Builder bd)
    {
        this.host = bd.host;
        this.port = bd.port;
        this.enablessl = bd.ssl;
        this.timeout = bd.timeout;
        this.consumergroup = bd.consumerGroup;
    }
    public String getHost(){
        return host;
    }

    public int getPort() {
        return port;
    }

    public Boolean getEnablessl() {
        return enablessl;
    }

    public int getTimeout() {
        return timeout;
    }

    public String getConsumergroup() {
        return consumergroup;
    }

    public static class Builder{
        private final String host;
        private final int port;

        // Optional parameters with default values
        private boolean ssl = false;
        private int timeout = 3000;
        private String consumerGroup = "default-group";

        public Builder(String host, int port)
        {
            this.host = host;
            this.port = port;
        }
        public Builder setTimeout(int val)
        {
            this.timeout = val;
            return this;
        }
        public Builder setSsl(Boolean val)
        {
            this.ssl = val;
            return this;
        }
        public Builder setConsumer(String val)
        {
            this.consumerGroup = val;
            return this;
        }
        public MessageClient build(){
            if (port <= 0) {
                throw new IllegalArgumentException("Port must be valid");
            }
            return new MessageClient(this);
        }
    }
}