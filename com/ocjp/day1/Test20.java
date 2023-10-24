package com.ocjp.day1;

import java.io.*;
import java.time.LocalDate;
import java.util.Optional;
 
public class Test20 {
    public static void main(String[] args)  throws IOException, ClassNotFoundException {
        Optional<LocalDate> optional = Optional.of(LocalDate.of(2018, 12, 1));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(("D:\\eclipse_java\\intellitech\\ocpjse8_1z0_809\\src\\com\\ocjp\\day1\\data.ser")));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\eclipse_java\\intellitech\\ocpjse8_1z0_809\\src\\com\\ocjp\\day1\\data.ser")))
        {
            oos.writeObject(optional);
 
            Optional<?> object = (Optional<?>)ois.readObject();
            System.out.println(object.get());
        }
    }
}