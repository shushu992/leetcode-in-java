package org.example;

/**
 * <a href="https://leetcode.com/problems/ugly-number/">LeetCode#263</a>
 * <p>
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * Given an integer n, return true if n is an ugly number.
 * <p>
 * -2^31 <= n <= 2^31 - 1
 */
public class Quiz263UglyNumber {

    public boolean isUgly(int n) {
        if (n <= 0) return false;

        while (true) {
            if (n == 1) return true;

            if (n % 2 == 0) {
                n /= 2;
                continue;
            }

            if (n % 3 == 0) {
                n /= 3;
                continue;
            }

            if (n % 5 == 0) {
                n /= 5;
                continue;
            }

            return false;
        }
    }
}
