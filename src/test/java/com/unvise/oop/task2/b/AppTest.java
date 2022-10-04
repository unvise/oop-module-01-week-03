package com.unvise.oop.task2.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void regularExpressionTest() {
        // given
        String act1 = "2001:db8:3333:4444:5555:6666:7777:8888";
        String act2 = "2001:db8:3333:4444:CCCC:DDDD:EEEE:FFFF";
        String act3 = "::1234:5678";
        String act4 = "2001:db8:3333:4444:5555:6666:1.2.3.4";
        String act5 = "2001:dg8::1234:5698:5.6.7.10";
        String act6 = "2001:db8:3333:4444:CCGC:DDDD:EEEE:FFFF";
        // then
        assertAll(
                () -> assertTrue(App.IPv6_PATTERN.matcher(act1).matches()),
                () -> assertTrue(App.IPv6_PATTERN.matcher(act2).matches()),
                () -> assertTrue(App.IPv6_PATTERN.matcher(act3).matches()),
                () -> assertTrue(App.IPv6_PATTERN.matcher(act4).matches()),
                () -> assertFalse(App.IPv6_PATTERN.matcher(act5).matches()),
                () -> assertFalse(App.IPv6_PATTERN.matcher(act6).matches())
        );
    }
}