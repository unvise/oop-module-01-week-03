package com.unvise.oop.task2.a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void regularExpressionTest() {
        // given
        String act1 = "test@gmail.com";
        String act2 = "test@gmail.com";
        String act3 = "te23ast@mail.ru";
        String act4 = "test@gsd4-il.com";
        String act5 = "test@gsd4-il.";
        String act6 = "test@.com";
        // then
        assertAll(
                () -> assertTrue(App.EMAIL_PATTERN.matcher(act1).matches()),
                () -> assertTrue(App.EMAIL_PATTERN.matcher(act2).matches()),
                () -> assertTrue(App.EMAIL_PATTERN.matcher(act3).matches()),
                () -> assertTrue(App.EMAIL_PATTERN.matcher(act4).matches()),
                () -> assertFalse(App.EMAIL_PATTERN.matcher(act5).matches()),
                () -> assertFalse(App.EMAIL_PATTERN.matcher(act6).matches())
        );
    }
}