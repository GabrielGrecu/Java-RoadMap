package com.roadmap.streamapi.amigoscode.functionalinterfaces;

import java.util.List;

public class ConsumerInterface {
    public static void main(String[] args) {
        sendEmail.accept("gabriel@yahoo.com");

        List<String> strings = List.of(
                "gabriel@yahoo.com",
                "ilie@yahoo.com"
        );
        strings.forEach(ConsumerInterface::sendEmail);
    }

    static java.util.function.Consumer<String> sendEmail =
            email -> System.out.println("sending email from: " + email);

    static void sendEmail(String email){
        System.out.println("sending email to " + email);
    }
}
