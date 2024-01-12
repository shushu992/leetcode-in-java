package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTests {

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {
        HelloWorld hw = new HelloWorld();
        assertEquals(2, hw.sum(1, 1),
                "1 + 1 should equal 2");
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    void add(int first, int second, int expectedResult) {
        HelloWorld hw = new HelloWorld();
        assertEquals(expectedResult, hw.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
