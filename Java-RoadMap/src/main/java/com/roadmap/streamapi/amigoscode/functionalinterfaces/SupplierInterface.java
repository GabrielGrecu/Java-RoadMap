package com.roadmap.streamapi.amigoscode.functionalinterfaces;

import java.util.List;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        System.out.println(getUrlSupplier.get());

    }

    static Supplier<List<String>> getUrlSupplier =
        () -> {
            //some logic
            return List.of("http://amigoscode.com");
        };


    static String getUrl(){
        return "htttp://amigoscode.com";
    }
}
