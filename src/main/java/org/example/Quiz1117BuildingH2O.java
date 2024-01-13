package org.example;

/**
 * <a href="https://leetcode.com/problems/building-h2o/description/">LeetCode#1117</a>
 * <p>
 * Constraints:
 * 3 * n == water.length
 * 1 <= n <= 20
 * water[i] is either 'H' or 'O'.
 * There will be exactly 2 * n 'H' in water.
 * There will be exactly n 'O' in water.
 */
public class Quiz1117BuildingH2O {

    private final byte[] lock = new byte[]{0, 0, 0};

    private void check() {
        if (lock[0] == 0) return;
        if (lock[1] == 0) return;
        if (lock[2] == 0) return;

        lock[0] = 0;
        lock[1] = 0;
        lock[2] = 0;
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        while (true) {
            synchronized (lock) {
                this.check();

                if (lock[0] == 0) {
                    lock[0] = 1;
                    releaseHydrogen.run();
                    break;
                }

                if (lock[2] == 0) {
                    lock[2] = 1;
                    releaseHydrogen.run();
                    break;
                }
            }
        }


    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        while (true) {
            synchronized (lock) {
                this.check();

                if (lock[1] == 0) {
                    lock[1] = 1;
                    releaseOxygen.run();
                    break;
                }
            }
        }
    }
}
