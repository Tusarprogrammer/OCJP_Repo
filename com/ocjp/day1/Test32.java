package com.ocjp.day1;

class A {
    public void someMethod(final String name) {
        final class B {
            void print() {
                System.out.println("Hello " + name);
            }
        }
        new B().print();
        
    }
}
 
public class Test32 {
    public static void main(String[] args) {
        new A().someMethod("World!");
    }
}
