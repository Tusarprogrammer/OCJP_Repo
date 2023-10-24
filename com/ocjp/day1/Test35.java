package com.ocjp.day1;

import java.util.Arrays;

public class Test35 {
    public static void main(String[] args) {
        String [] cities = {"Abc","Seoul", "Tokyo", "Paris", "London", 
                                  "Hong Kong", "Singapore"};
        Arrays.stream(cities).sorted((s1,s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}
