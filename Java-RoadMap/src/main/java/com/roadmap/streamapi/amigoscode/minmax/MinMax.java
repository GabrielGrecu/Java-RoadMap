package com.roadmap.streamapi.amigoscode.minmax;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2,3,7,1,5,2,100);
        Integer min = numbers.stream().min(((o1, o2) -> o1.compareTo(o2))).get();
        System.out.println(min);

        Integer min2 = numbers.stream().min(Integer::compareTo).get();
        System.out.println(min2);

        Integer min3 = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min3);


        Integer max = numbers.stream().max(((o1, o2) -> o1.compareTo(o2))).get();
        System.out.println(max);

        Integer max2 = numbers.stream().max(Integer::compareTo).get();
        System.out.println(max2);

        Integer max3 = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max3);
    }

}
