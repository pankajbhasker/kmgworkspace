package com.bhasker.dgstack.ThreadingCheck;

import static java.lang.System.gc;

public class ByRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread using Runnable interface");
        gc();

    }
    public static void main(String args[]){
        ByRunnable runnable = new ByRunnable();
        runnable.run();

    }
}
