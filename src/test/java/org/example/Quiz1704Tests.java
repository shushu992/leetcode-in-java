package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings("SpellCheckingInspection")
public class Quiz1704Tests {

    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "aa",
            "aE",
            "abba",
            "abbE",
            "abaIbU",
            "abeIbU",
    })
    void alike(String s) {
        var result = new Quiz1704DetermineIfStringHalvesAreAlike()
                .halvesAreAlike(s);
        assertTrue(result);
    }

    @ParameterizedTest(name = "{0}")
    @CsvSource({
            "ab",
            "aB",
            "abbb",
            "abbB",
            "abaBbU",
            "abeBbU",
    })
    void unlike(String s) {
        var result = new Quiz1704DetermineIfStringHalvesAreAlike()
                .halvesAreAlike(s);
        assertFalse(result);
    }
}
