package com.unvise.oop.task2.b;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static final Pattern IPv6_PATTERN =
            Pattern.compile("^([0-9A-Fa-f]{0,4}:){2,7}" +
                    "([0-9A-Fa-f]{1,4}$|((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\.|$)){4})$");

    public static void main(String[] args) {
        try (Scanner strScanner = new Scanner(System.in)) {
            System.out.print("Введите IPv6: ");
            String ipv6 = strScanner.nextLine();
            boolean isIPv6Valid = IPv6_PATTERN.matcher(ipv6).matches();
            System.out.printf("Введенный IPv6 (%s) " + (isIPv6Valid ? "валидный" : "не валидный"), ipv6);
        }
    }
}
