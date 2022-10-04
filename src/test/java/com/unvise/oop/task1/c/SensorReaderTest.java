package com.unvise.oop.task1.c;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SensorReaderTest {

    @Test
    void sortByIdTest() {
        // given
        SensorReader reader = new SensorReader("3744@6646@63-4@461@127");
        Double[][] clonedData = reader.getData().clone();
        Arrays.sort(clonedData, Comparator.comparingDouble(x -> x[0]));
        reader.sort(true, false);
        // then
        assertArrayEquals(clonedData, reader.getData());
    }

    @Test
    void sortByValueTest() {
        // given
        SensorReader reader = new SensorReader("3744@6646@63-4@461@127");
        Double[][] clonedData = reader.getData().clone();
        Arrays.sort(clonedData, Comparator.comparingDouble(x -> x[1]));
        reader.sort(false, true);
        // then
        assertArrayEquals(clonedData, reader.getData());
    }

    @Test
    void sortByIdAndValueTest() {
        // given
        SensorReader reader = new SensorReader("3744@6646@63-4@461@127");
        Double[][] clonedData = reader.getData().clone();
        Arrays.sort(clonedData, Comparator.<Double[]>comparingDouble(x -> x[0])
                                          .thenComparing(x -> x[1]));
        reader.sort(true, true);
        // then
        assertArrayEquals(clonedData, reader.getData());
    }

    @Test
    void readTest() {
        // given
        SensorReader reader = new SensorReader("3744@6646@63-4@461@127");
        reader.sort(true, false);
        String text = """
                12 7,0
                37 44,0
                46 1,0
                63 -4,0
                66 46,0
                """;
        // then
        assertEquals(text, reader.read("%.0f %.1f"));
    }
}