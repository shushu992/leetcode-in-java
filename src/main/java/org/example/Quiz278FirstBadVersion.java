package org.example;

/**
 * <a href="https://leetcode.com/problems/first-bad-version/description/">LeetCode#278</a>
 * <p>
 * 1 <= bad <= n <= 2^31 - 1
 */
public class Quiz278FirstBadVersion {

    private final int BadVersion;

    public Quiz278FirstBadVersion(int bad) {
        this.BadVersion = bad;
    }

    private boolean isBadVersion(int version) {
        return this.BadVersion <= version;
    }

    public int firstBadVersion(int n) {
        var start = 1;
        var end = n;

        while (true) {
            if (isBadVersion(start)) {
                return start;
            }

            var middle = start + (end - start) / 2;
            if (isBadVersion(middle)) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
    }
}
