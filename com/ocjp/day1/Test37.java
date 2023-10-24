package com.ocjp.day1;

public class Test37 {
    public static void convert(String s)
            throws IllegalArgumentException, RuntimeException, Exception {
        if(s.length() == 0) {
            throw new RuntimeException("Length should be greater than 0.");
        }
    }
    public static void main(String [] args) {
        try {
            convert("");
        }
        catch(RuntimeException e) { //Line 14
            System.out.println(e.getMessage()); //Line 15
        } //Line 16
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}