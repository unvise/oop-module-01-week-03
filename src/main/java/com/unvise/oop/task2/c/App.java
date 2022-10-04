package com.unvise.oop.task2.c;

import com.unvise.oop.task1.util.ScannerUtil;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static final Pattern SYMBOLS_MORE_THAN_THREE_TIMES = Pattern.compile("(.)\\1{2,}");

    public static void main(String[] args) {
        try (Scanner strScanner = new Scanner(System.in)) {
            String text = ScannerUtil.nextLines(strScanner);
            System.out.println(sliceIdenticalSymbols(text));
        }
    }

    public static String sliceIdenticalSymbols(String str) {
        Matcher matcher = SYMBOLS_MORE_THAN_THREE_TIMES.matcher(str);
        while (matcher.find()) {
            str = str.replaceAll(matcher.group(0), matcher.group(1));
        }
        return str;
    }
}
