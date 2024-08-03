package DesignPatterns.CreationalDesignPatterns.Builder.MessageBuilder;

@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;


    private MessageBuilder(MessageType messageType, String content, String sender, String recipient, boolean isDelivered, long timestamp) {
        this.messageType = messageType;
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
        this.isDelivered = isDelivered;
        this.timestamp = timestamp;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{

        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public Builder setMessageType(MessageType messageType){
            this.messageType = messageType;
            return this;
        }

        public Builder setContent(String content){
            this.content = content;
            return this;
        }

        public Builder setSender(String sender){
            this.sender = sender;
            return this;
        }

        public Builder setRecipient(String recipient){
            this.recipient = recipient;
            return this;
        }

        public Builder isDelivered(boolean isDelivered){
            this.isDelivered = isDelivered;
            return this;
        }

        public Builder setTimestamp(long timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public MessageBuilder build(){
            return new MessageBuilder(messageType,content,sender,recipient,isDelivered,timestamp);
        }
    }
}
