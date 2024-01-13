package org.example;

import java.util.function.IntConsumer;

/**
 * <a href="https://leetcode.com/problems/fizz-buzz-multithreaded/">LeetCode#1195</a>
 * <p>
 * 1 <= n <= 50
 */
public class Quiz1195FizzBuzz {

    private final int n;
    private int n1 = 1;

    public Quiz1195FizzBuzz(int n) {
        this.n = n;
    }

    // "fizz" if i is divisible by 3 and not 5,
    public void fizz(Runnable printFizz) throws InterruptedException {
        while (n1 <= n) {
            if (n1 % 5 == 0 || n1 % 3 != 0) {
                Thread.yield();
                continue;
            }

            printFizz.run();
            n1++;
        }
    }

    // "buzz" if i is divisible by 5 and not 3
    public void buzz(Runnable printBuzz) throws InterruptedException {
        while (n1 <= n) {
            if (n1 % 5 != 0 || n1 % 3 == 0) {
                Thread.yield();
                continue;
            }

            printBuzz.run();
            n1++;
        }
    }

    // "fizzbuzz" if i is divisible by 3 and 5
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        while (n1 <= n) {
            if (n1 % 15 != 0) {
                Thread.yield();
                continue;
            }

            printFizzBuzz.run();
            n1++;
        }
    }

    // i if i is not divisible by 3 or 5.
    public void number(IntConsumer printNumber) throws InterruptedException {
        while (n1 <= n) {
            if (n1 % 3 == 0 || n1 % 5 == 0) {
                Thread.yield();
                continue;
            }

            printNumber.accept(n1);
            n1++;
        }
    }
}
