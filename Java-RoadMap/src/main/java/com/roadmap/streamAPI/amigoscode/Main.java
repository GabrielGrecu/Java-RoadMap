package com.roadmap.streamAPI.amigoscode;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        EmailSender sender = new Gmail();
        sender.send("gabriel");

        EmailSender gmail = email -> {
            var isValid = email.contains("@");
            System.out.println("gmail");
        };

        gmail.send("grecualexandrugabriel@yahoo.com");

        List<String> animals = List.of("vaca", "pui", "caine");
        Consumer<String> stringConsumer = System.out::println;
        animals.forEach(stringConsumer);
    }
}
