package com.ocjp.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class Test9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,-8,5,5);
        Predicate<Integer> predicate = num -> {
            int ctr = 1;
            boolean result = num > 0;
            System.out.print(ctr++ + ".");
            return result;
        };
        
        list.stream().filter(predicate).findFirst();
    }
}
