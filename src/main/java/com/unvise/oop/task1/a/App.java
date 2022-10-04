package com.unvise.oop.task1.a;

import com.unvise.oop.task1.util.ScannerUtil;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner strScanner = new Scanner(System.in)) {
            // можно ввести несколько строк
            // чтобы завершить операцию надо ввести пустую строку
            System.out.print("Что ищем: ");
            String target = ScannerUtil.nextLines(strScanner);
            System.out.print("Где ищем: ");
            String text = ScannerUtil.nextLines(strScanner);

            System.out.println(countSubstring(text, target));
        }
    }

    public static int countSubstring(String text, String target) {
        return (text.length() - text.replace(target, "").length()) / target.length();
    }
}
