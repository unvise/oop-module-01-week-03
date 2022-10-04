package com.unvise.oop.task1.b;

import com.unvise.oop.task1.util.AlphabetGenerator;

public class ShannonEntropy {
    private static final char[] ALPHABET = AlphabetGenerator.english(false, false);

    // алгоритм не игнорирует регистр и пустые пробелы
    public static double compute(String text) {
        int[] frequencies = findFrequencies(text);
        double[] probabilities = findProbabilities(text, frequencies);
        return findEntropy(probabilities);
    }

    private static double findEntropy(double[] probabilities) {
        double entropy = 0;
        for (double probability : probabilities) {
            if (probability != 0) {
                entropy += probability * log2(probability);
            }
        }
        return -1 * entropy;
    }

    private static int[] findFrequencies(String text) {
        int textLength = text.length();
        int[] frequencies = new int[ALPHABET.length];
        for (int i = 0; i < textLength; i++) {
            for (int j = 0; j < ALPHABET.length; j++) {
                if (text.charAt(i) == ALPHABET[j]) {
                    frequencies[j]++;
                    break;
                }
            }
        }
        return frequencies;
    }

    private static double[] findProbabilities(String text, int[] frequencies) {
        int textLength = text.length();
        int n = frequencies.length;
        double[] probabilities = new double[n];
        for (int i = 0; i < n; i++) {
            probabilities[i] = (double) frequencies[i] / textLength;
        }
        return probabilities;
    }

    private static double log2(double a) {
        return Math.log(a) / Math.log(2);
    }
}
