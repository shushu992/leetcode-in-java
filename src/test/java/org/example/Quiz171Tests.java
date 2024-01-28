package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz171Tests {

    @ParameterizedTest(name = "{0}: {1}")
    @CsvSource({
            "A, 1",
            "B, 2",
            "C, 3",
            "Z, 26",
            "AA, 27",
            "AB, 28",
    })
    void test(String title, int expected) {
        var actual = new Quiz171ExcelSheetColumnNumber()
                .titleToNumber(title);
        assertEquals(expected, actual);
    }
}
