package com.ocjp.day1;

import java.util.concurrent.*;

class MyThread implements Runnable {
    private String str;
 
    MyThread(String str) {
        this.str = str;
    }
 
    public void run() {
        System.out.println(str.toUpperCase());
    }
}
 
public class Test33 {
    public static void main(String[] args) throws ExecutionException, InterruptedException{
        ExecutorService es = Executors.newSingleThreadExecutor();
        MyThread thread = new MyThread("ocp");
        Future future = es.submit(thread);
        Integer tmp = (Integer) future.get(); //Line 22
        System.out.println(tmp);
        es.shutdown();
    }
}
