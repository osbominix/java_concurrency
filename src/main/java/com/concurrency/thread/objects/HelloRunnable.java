package com.concurrency.thread.objects;

/**
 * Created by yl on 24/06/16.
 */
public class HelloRunnable implements Runnable {


    public void run() {
        System.out.println("Hello from thread " + getClass());
    }

}
