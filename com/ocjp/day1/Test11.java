package com.ocjp.day1;

class Outer {
    abstract static class Animal { //Line 2
        abstract void eat();
    }
    
    static class Dog extends Animal { //Line 6
        void eat() { //Line 7
            System.out.println("Dog eats biscuits");
        }
    }
}
 
public class Test11 {
    public static void main(String[] args) {
        Outer.Animal animal = new Outer.Dog(); //Line 15
        animal.eat();
    }
}
