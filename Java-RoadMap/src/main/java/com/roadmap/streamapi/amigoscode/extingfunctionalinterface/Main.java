package com.roadmap.streamapi.amigoscode.extingfunctionalinterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailValidator emailValidator = new EmailValidator();

        List<String> emails = List.of(
                "gabriel@yahoo.com",
                "ilieyahoo.com"
        );

        emails.forEach(email -> {
            var isValid= emailValidator.apply(email);
            System.out.println("Email %s is valid: %s".formatted(email, isValid));
        });

        Person gabriel = new Person("gabriel",
                                    "+407343242",
                                    "grecu@yahoo.com");

        Person ion = new Person("ion",
                "+407343242",
                "grecuyahoo.com");

        PersonRegistrationValidator validator =
                PersonRegistrationValidator.isEmailTaken()
                        .and(PersonRegistrationValidator.isEmailValid())
                        .and(PersonRegistrationValidator.isPhoneNumberValid());

        System.out.println(validator.apply(gabriel));
        System.out.println(validator.apply(ion));
    }
}
