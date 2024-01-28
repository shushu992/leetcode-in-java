package org.example;

/**
 * <a href="https://leetcode.com/problems/excel-sheet-column-number/description/">LeetCode#171</a>
 * <p>
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */
public class Quiz171ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        var result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            result *= 26;
            result += columnTitle.charAt(i) - '@';
        }

        return result;
    }
}
