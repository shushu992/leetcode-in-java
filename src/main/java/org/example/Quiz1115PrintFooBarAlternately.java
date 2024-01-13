package org.example;

/**
 * <a href="https://leetcode.com/problems/print-foobar-alternately/description/">LeetCode#1115</a>
 * <p>
 * 1 <= n <= 1000
 */
public class Quiz1115PrintFooBarAlternately {

    private final int n;
    private int n1 = 0;

    public Quiz1115PrintFooBarAlternately(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (n1 != 0)
                Thread.yield();

            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();

            n1 = 1;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (n1 != 1)
                Thread.yield();

            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();

            n1 = 0;
        }
    }
}
