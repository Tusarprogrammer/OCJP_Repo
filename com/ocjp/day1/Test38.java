package com.ocjp.day1;

import java.util.ArrayDeque;
import java.util.Deque;
 
public class Test38 {
    public static void main(String[] args) {
        Deque<Boolean> deque = new ArrayDeque<>();
        deque.push(new Boolean("abc"));
        deque.push(new Boolean("tRuE"));
        deque.push(new Boolean("FALSE"));
        deque.push(true);
        //deque.push(false);
        System.out.println(deque.pop() + ":" + deque.peek() + ":" + deque.size());
    }
}