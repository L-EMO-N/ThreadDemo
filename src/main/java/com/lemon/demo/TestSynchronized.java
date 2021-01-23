package com.lemon.demo;

/**
 * <p>Description: </p>
 * <p>Company:</p>
 *
 * @author luolin
 * @date 2021/1/23
 */
public class TestSynchronized {

    public static synchronized void minus() {
        int count = 20;
        for (int i = 0; i < 20; i++) {
                count--;
            System.out.println(Thread.currentThread().getName() + " - " + count);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }

    }
}
