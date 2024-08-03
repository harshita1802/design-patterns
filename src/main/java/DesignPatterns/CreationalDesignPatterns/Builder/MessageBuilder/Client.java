package DesignPatterns.CreationalDesignPatterns.Builder.MessageBuilder;

public class Client {
    public static void main(String[] args) {

        MessageBuilder mb = MessageBuilder.builder()
                                        .isDelivered(true)
                                        .setMessageType(MessageType.AUDIO)
                                        .setSender("Harshita")
                                        .setRecipient("Rakshita")
                                        .setContent("Hey! whatssup")
                                        .setTimestamp(10)
                                        .build();



    }
}
