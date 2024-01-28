package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz278Tests {

    @ParameterizedTest(name = "n = {0}, bad = {1}")
    @CsvSource({
            "1, 1",

            "2, 1",
            "2, 2",

            "3, 1",
            "3, 2",
            "3, 3",

            "4, 1",
            "4, 2",
            "4, 3",
            "4, 4",

            "65535, 256",
    })
    void test(int n, int bad) {
        var actual = new Quiz278FirstBadVersion(bad)
                .firstBadVersion(n);
        assertEquals(bad, actual);
    }
}
