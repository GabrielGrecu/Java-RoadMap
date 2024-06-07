package com.roadmap.streamapi.amigoscode.functionalinterfaces;

public class BiFunctionInterface {
    public static void main(String[] args) {
        Person gabriel = personMapper.apply("Gabriel", 26);
        System.out.println(gabriel);
    }

    static java.util.function.BiFunction<String, Integer, Person> personMapper = Person::new;

    /**
     * static BiFunction<String, Integer, Person> personMapper =
     *             (name, age) -> new Person(name, age);
     * @param name
     * @param age
     */


    record Person(String name, int age){}
    static Person personMapper(String name, int age){
        return new Person(name, age);
    }
}
