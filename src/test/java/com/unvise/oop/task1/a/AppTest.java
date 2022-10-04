package com.unvise.oop.task1.a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void countSubstring() {
        // given
        String text = """
                aa
                Где ищем:
                aaba
                ababa
                cgaaaer
                """;
        // then
        assertEquals(3, App.countSubstring(text, "aa"));
    }
}