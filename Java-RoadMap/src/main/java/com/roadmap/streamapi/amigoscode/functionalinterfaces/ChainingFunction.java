package com.roadmap.streamapi.amigoscode.functionalinterfaces;

import java.util.function.Function;

public class ChainingFunction {
    public static void main(String[] args) {
        System.out.println(incrementByOne(1));
        Function<Integer, Integer> integerIntegerFunction = incrementByOne.andThen(doubleFunc);
        System.out.println(integerIntegerFunction.apply(7));


    }

    static Function<Integer, Integer> incrementByOne = number -> number + 1;

    static Function<Integer, Integer> doubleFunc = number -> number * 2;

    static int incrementByOne(int number) {
        return number + 1;
    }
}
