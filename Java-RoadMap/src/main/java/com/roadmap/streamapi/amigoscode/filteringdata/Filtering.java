package com.roadmap.streamapi.amigoscode.filteringdata;

import com.roadmap.streamapi.amigoscode.beans.Car;
import com.roadmap.streamapi.amigoscode.mockdata.MockData;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filtering {
    public static void main(String[] args) throws IOException {
        List<Car> cars = MockData.getCars();

        Predicate<Car> yellow = car -> car.getColor().equals("Yellow");
        Predicate<Car> carPredicate = car -> car.getPrice() < 20_000.00;
        List<Car> carsLessThan20k = cars.stream()
                .filter(carPredicate)
                .filter(yellow)
                .collect(Collectors.toList());
        carsLessThan20k.forEach(System.out::println);
    }
}
