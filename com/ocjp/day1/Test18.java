package com.ocjp.day1;

import java.io.*;

public class Test18 {
    public static void main(String[] args) {
        File dir = new File("F:" + File.separator + "A" + File.separator + "B");
        System.out.println(dir.getParentFile().getParent());
    }
}
