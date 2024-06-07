package com.roadmap.streamapi.amigoscode.extingfunctionalinterface;

import java.util.function.Function;

public class EmailValidator implements Function<String, Boolean> {

    @Override
    public Boolean apply(String email) {
        return email.contains("@");
    }
}
