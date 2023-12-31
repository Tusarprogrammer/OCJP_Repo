package com.ocjp.day1;

import java.util.concurrent.atomic.AtomicInteger;

class Counter implements Runnable {
    private static AtomicInteger ai = new AtomicInteger(3);
 
    public void run() {
        System.out.print(ai.getAndDecrement());
    }
}
 
public class Test7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());
        Thread t3 = new Thread(new Counter());
        Thread[] threads = {t1, t2, t3};
        for(Thread thread : threads) {
            thread.start();
        }
    }
}
