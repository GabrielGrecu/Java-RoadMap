package com.roadmap.streamapi.amigoscode.gettingstarted;

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


        List<String> names = List.of("Gabriel", "Maria");
        names.forEach(System.out::println);

        EmailSender emailSender = outlook -> System.out.println("sending mail from outlook");
    }
}
