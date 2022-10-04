package com.unvise.oop.task2.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void regularExpressionTest() {
        // given
        String act1 = "ассимиииляццццция";
        String act2 = "аннииигиляяяторннная пууушка";
        // then
        assertAll(
                () -> assertEquals("ассимиляция", App.sliceIdenticalSymbols(act1)),
                () -> assertEquals("аннигиляторная пушка", App.sliceIdenticalSymbols(act2))
        );
    }
}