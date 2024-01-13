package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.function.IntConsumer;

import static org.junit.jupiter.api.Assertions.*;

public class Quiz1116Tests {

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "1, 01",
            "2, 0102",
            "3, 010203",
            "4, 01020304",
            "5, 0102030405",
            "20, 010203040506070809010011012013014015016017018019020",
    })
    void test(int value, String expected) {
        var quiz1116 = new Quiz1116PrintZeroEvenOdd(value);
        var seq = new IntSequence();

        var thread1 = new Thread(() -> {
            try {
                Thread.sleep(3);
                quiz1116.zero(seq);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        var thread2 = new Thread(() -> {
            try {
                Thread.sleep(2);
                quiz1116.even(seq);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        var thread3 = new Thread(() -> {
            try {
                Thread.sleep(1);
                quiz1116.odd(seq);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        assertEquals(expected, seq.toString());
    }

    private static class IntSequence implements IntConsumer {

        private final StringBuffer s = new StringBuffer();

        @Override
        public void accept(int value) {
            s.append(value);
        }

        public String toString() {
            return s.toString();
        }
    }
}
