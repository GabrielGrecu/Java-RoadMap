package com.roadmap.streamapi.amigoscode.functionalinterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExcercise {
    public static void main(String[] args) {
        sendEmail("a", "b");
        sendEmailBiConsumer.accept("gabriel@yahoo.com", "monica@yahoo");

    }

    static BiConsumer<String, String > sendEmailBiConsumer = (from, to) ->
            System.out.printf("Sending email from  %s to %s".formatted(from, to));

    static void sendEmail(String from, String to) {
        System.out.println("Sending from " + from + " email to " + to);
    }
}
