package com.unvise.oop.task2.a;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w-]+@[\\w-]+\\.+\\w{2,6}$");

    public static void main(String[] args) {
        try (Scanner strScanner = new Scanner(System.in)) {
            System.out.print("Введите email: ");
            String email = strScanner.nextLine();
            boolean isEmailValid = EMAIL_PATTERN.matcher(email).matches();
            System.out.printf("Введенный email (%s) " + (isEmailValid ? "валидный" : "не валидный"), email);
        }
    }
}
