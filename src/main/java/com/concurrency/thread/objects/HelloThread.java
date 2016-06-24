package com.concurrency.thread.objects;

/**
 * Created by yl on 24/06/16.
 */
public class HelloThread extends Thread {


    public void run() {
        System.out.println("Hello from thread " + getClass());}

}