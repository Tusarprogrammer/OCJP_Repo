package com.ocjp.day1;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> map = new TreeMap<>();
        map.put(25, "Pune");
        map.put(32, "Mumbai");
        map.put(11, "Sri Nagar");
        map.put(39, "Chennai");
 
        System.out.println(map.headMap(25, true));
    }
}