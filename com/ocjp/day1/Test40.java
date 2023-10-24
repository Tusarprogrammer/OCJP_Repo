package com.ocjp.day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
 
public class Test40 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties ();
        FileInputStream fis = new FileInputStream ("D:\\eclipse_java\\intellitech\\ocpjse8_1z0_809\\src\\com\\ocjp\\day1\\Message.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("key1"));
        System.out.println(prop.getProperty("key2", "Good Day!"));
        System.out.println(prop.getProperty("key3", "Good Day!"));
        System.out.println(prop.getProperty("key4"));
    }
}