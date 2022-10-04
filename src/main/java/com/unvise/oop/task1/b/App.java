package com.unvise.oop.task1.b;

import com.unvise.oop.task1.util.ScannerUtil;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner strScanner = new Scanner(System.in)) {
            // можно ввести несколько строк
            // чтобы завершить операцию надо ввести пустую строку
            String text = ScannerUtil.nextLines(strScanner);
            System.out.printf("%.2f", ShannonEntropy.compute(text));
        }
    }
}
