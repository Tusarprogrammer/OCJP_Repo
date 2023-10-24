package com.ocjp.day1;

import java.nio.file.Path;
import java.nio.file.Paths;
 
public class Test30 {
    public static void main(String[] args) {
        Path path = Paths.get("F:\\A\\B\\C\\Book.java");
       // System.out.println(path.subpath(1,4));
        System.out.println(path.subpath(1,3));
    }
}