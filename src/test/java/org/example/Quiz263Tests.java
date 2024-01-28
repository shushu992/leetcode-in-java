package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.function.IntConsumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Quiz263Tests {

    @ParameterizedTest(name = "{0}: {1}")
    @CsvSource({
            "-2, false",
            " 0, false",
            " 1, true",
            " 2, true",
            " 3, true",
            " 5, true",
            " 6, true",
            "16, true",
            "27, true",
            "30, true",
            "36, true",
            "45, true",
            "14, false",
            "22, false",
            "28, false",
    })
    void test(int value, boolean expected) {
        var actual = new Quiz263UglyNumber()
                .isUgly(value);
        assertEquals(expected, actual);
    }
}
