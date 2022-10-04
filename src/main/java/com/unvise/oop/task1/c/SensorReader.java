package com.unvise.oop.task1.c;

import java.util.Arrays;
import java.util.Comparator;

public class SensorReader {
    private static final String DELIMITER = "@";
    private Double[][] data;

    public SensorReader(String data) {
        this.data = splitData(data);
    }

    public Double[][] getData() {
        return data;
    }

    public void setData(Double[][] data) {
        this.data = data;
    }

    public void sort(boolean byId, boolean byValue) {
        if (byId && byValue) {
            Arrays.sort(data, Comparator.<Double[], Double>comparing(x -> x[0]).thenComparing(x -> x[1]));
            return;
        }
        if (byId) Arrays.sort(data, Comparator.comparingDouble(x -> x[0]));
        if (byValue) Arrays.sort(data, Comparator.comparingDouble(x -> x[1]));
    }

    public String read(String format) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Double[] entry : data) {
            stringBuilder
                    .append(String.format(format, entry[0], entry[1]))
                    .append("\n");
        }
        return stringBuilder.toString();
    }

    private Double[][] splitData(String data) {
        String[] splitData = data.split(DELIMITER);
        return splitIdsAndValues(splitData);
    }

    private Double[][] splitIdsAndValues(String[] data) {
        Double[][] idsAndValues = new Double[data.length][2];
        for (int i = 0; i < data.length; i++) {
            double id = Double.parseDouble(data[i].substring(0, 2));
            double value = Double.parseDouble(data[i].substring(2));
            idsAndValues[i] = new Double[]{id, value};
        }
        return idsAndValues;
    }
}
