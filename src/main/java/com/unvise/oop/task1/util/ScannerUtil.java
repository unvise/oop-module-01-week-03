package com.unvise.oop.task1.util;

import java.util.Objects;
import java.util.Scanner;

public class ScannerUtil {
    private static final String SYSTEM_LINE_SEPARATOR = System.getProperty("line.separator");

    public static String nextLines(Scanner scanner) {
        // конструкция для считывания всех строк из потока ввода
        // до первой пустой строки
        // P.S если есть пробел(ы), то строка пустой не считается
        scanner.useDelimiter(SYSTEM_LINE_SEPARATOR);
        StringBuilder sb = new StringBuilder();
        String inputtedLine = "_";
        while (!Objects.equals(inputtedLine, "")) {
            inputtedLine = scanner.nextLine();
            sb.append(inputtedLine);
        }
        return sb.toString();
    }
}
