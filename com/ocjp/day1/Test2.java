package com.ocjp.day1;

import java.util.function.BiPredicate;

public class Test2 {
    public static void main(String[] args) {
        BiPredicate<String, String> predicate = String::equalsIgnoreCase;
        System.out.println(predicate.test("JaVa", "Java"));
    }
}
