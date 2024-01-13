package org.example;

import java.util.function.IntConsumer;

/**
 * <a href="https://leetcode.com/problems/print-zero-even-odd/description/">LeetCode#1116</a>
 * <p>
 * 1 <= n <= 1000
 */
public class Quiz1116PrintZeroEvenOdd {

    private final int n;
    private int n1 = 0;

    public Quiz1116PrintZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while (n1 < 2 * n) {
            if (n1 % 2 != 0) {
                Thread.yield();
                continue;
            }

            printNumber.accept(0);
            n1++;
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while (n1 < 2 * n) {
            if (n1 % 4 != 3) {
                Thread.yield();
                continue;
            }

            printNumber.accept((n1 + 1) / 2);
            n1++;
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while (n1 < 2 * n) {
            if (n1 % 4 != 1) {
                Thread.yield();
                continue;
            }

            printNumber.accept((n1 + 1) / 2);
            n1++;
        }
    }
}
