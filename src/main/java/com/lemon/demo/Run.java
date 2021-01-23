package com.lemon.demo;

/**
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author luolin
 * @date 2021/1/23
 */
public class Run {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                TestSynchronized.minus();
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                TestSynchronized.minus();
            }
        });

        thread1.start();
        thread2.start();

    }

}
