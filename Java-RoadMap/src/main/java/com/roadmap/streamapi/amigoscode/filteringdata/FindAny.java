package com.roadmap.streamapi.amigoscode.filteringdata;

import java.util.Arrays;

public class FindAny {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10};
        int result = Arrays.stream(numbers).filter(n -> n == 9)
                .findAny()
                .orElse(-1);
        System.out.println(result);
    }



}
