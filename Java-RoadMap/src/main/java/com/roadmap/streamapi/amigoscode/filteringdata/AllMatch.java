package com.roadmap.streamapi.amigoscode.filteringdata;

import java.util.Arrays;

public class AllMatch {
    public static void main(String[] args) {
        int[] even = {2, 4, 6, 8, 10};
        boolean allMatch = Arrays.stream(even).allMatch(n -> n % 2 == 0);
        System.out.println(allMatch);

    }


}
