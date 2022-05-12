package me.rootsong.designpatterns._01_creational_patterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {
    
    public static void main(String[] args) {
//        Stream.Builder<String> stringStreamBuilder = Stream.builder();
//        Stream<String> names = stringStreamBuilder.add("rootsong").add("whiteShip").build();
//        names.forEach(System.out::println);
    
        Stream<String> names = Stream.<String>builder().add("rootsong").add("whiteShip").build();
    
    }
}
