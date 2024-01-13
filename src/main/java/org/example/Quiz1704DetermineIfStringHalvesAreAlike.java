package org.example;


/**
 * <a href="https://leetcode.com/problems/determine-if-string-halves-are-alike">LeetCode#1704</a>
 * <p>
 * Constraints:
 * * 2 <= s.length <= 1000
 * s.length is even.
 * s consists of uppercase and lowercase letters.
 */
public class Quiz1704DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        // 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        var vowels = 0b100000100000100010001;

        var size = s.length();

        var count = 0;

        for (int i = 0; i < size / 2; i++) {
            var c = s.charAt(i);
            if (c < 'a') {
                count += vowels >> (c - 'A') & 1;
            } else {
                count += vowels >> (c - 'a') & 1;
            }
        }

        for (int i = size / 2; i < size; i++) {
            var c = s.charAt(i);
            if (c < 'a') {
                count -= vowels >> (c - 'A') & 1;
            } else {
                count -= vowels >> (c - 'a') & 1;
            }
        }

        return count == 0;
    }
}
