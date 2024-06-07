package com.roadmap.streamapi.amigoscode.functionalinterfaces;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionInterface {
    public static void main(String[] args) {
        System.out.println(incrementByOne(1));
        System.out.println(incrementByOne.apply(2));

        List<Integer> collect = List.of(1, 2, 3)
                .stream()
                .map(FunctionInterface::incrementByOne)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    static java.util.function.Function<Integer, Integer> incrementByOne = number -> number+1;

    static int incrementByOne(int number){
        return number + 1;
    }
}
