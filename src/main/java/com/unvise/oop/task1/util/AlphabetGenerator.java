package com.unvise.oop.task1.util;

public class AlphabetGenerator {
    public static final String ENGLISH_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static char[] english(boolean ignoreCase, boolean ignoreSpace) {
        String alphabet = ENGLISH_ALPHABET;
        if (!ignoreCase) alphabet = alphabet.concat(alphabet.toLowerCase());
        if (!ignoreSpace) alphabet = alphabet.concat(" ");
        return alphabet.toCharArray();
    }
}
