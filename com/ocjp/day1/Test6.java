package com.ocjp.day1;

import java.nio.file.Path;
import java.nio.file.Paths;
 
public class Test6 {
    public static void main(String[] args) {
        Path path1 = Paths.get("F:\\A\\B\\C");
        Path path2 = Paths.get("F:\\A");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }
}
