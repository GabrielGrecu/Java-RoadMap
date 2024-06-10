package com.roadmap.streamapi.amigoscode.removeduplicates;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,2,33,33,4,5,5,4,8,9);
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

//        Set<Integer> integerSet = new HashSet<>(numbers);
        Set<Integer> integerSet = numbers.stream().collect(Collectors.toSet());
        System.out.println(integerSet);
    }
}
