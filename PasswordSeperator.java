package com.tka;

import java.util.Scanner;

public class PasswordSeperator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuffer specialChars = new StringBuffer();

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digits.append(ch);
            } else if (Character.isLetter(ch)) {
                letters.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits.toString());
        System.out.println("Special Characters: " + specialChars.toString());

        sc.close();
    }
}
