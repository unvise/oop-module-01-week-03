package com.unvise.oop.task1.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShannonEntropyTest {

    @Test
    void compute() {
        // given
        String act1 = "TEST STRING test string";
        String act2 = "This calculator computes Shannon entropy for symbol frequencies of a given message";
        // when
        assertAll(
                () -> assertEquals(3.73, ShannonEntropy.compute(act1), 0.01),
                () -> assertEquals(4.20, ShannonEntropy.compute(act2), 0.01)
        );
    }
}