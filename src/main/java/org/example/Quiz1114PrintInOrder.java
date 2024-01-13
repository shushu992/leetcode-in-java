package org.example;

/**
 * <a href="https://leetcode.com/problems/print-in-order/">LeetCode#1114</a>
 */
public class Quiz1114PrintInOrder {

    private int spin = 0;

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();

        spin++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (spin < 1) {
            Thread.yield();
        }

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();

        spin++;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (spin < 2) {
            Thread.yield();
        }

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();

        spin++;
    }
}
