package com.roadmap.streamapi.amigoscode.filteringdata;

import java.util.Arrays;

public class AnyMatch {
    public static void main(String[] args) {
        int[] evenAndOneOdd = {2, 4, 6, 8, 10, 11};
        boolean anyMatch = Arrays.stream(evenAndOneOdd).anyMatch(n -> !(n % 2 == 0));
        System.out.println(anyMatch);
    }
}
