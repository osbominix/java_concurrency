package com.concurrency;

import com.concurrency.thread.objects.HelloRunnable;
import com.concurrency.thread.objects.HelloThread;

/**
 * Alt+8, Alt+9, Alt+5, Alt+6
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/procthread.html
 * Created by yl on 24/06/16.
 */
public class Main {

    public static void main(String[] args) {

        //run HelloRunnable
        (new Thread(new HelloRunnable())).start();

        (new HelloThread()).start();


    }
}
