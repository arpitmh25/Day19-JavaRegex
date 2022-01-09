package com.bridgelabz.regex.day19;

import java.util.Scanner;

public class UserRegistartionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FirstName:");
        String firstName = scanner.next();
        UserDetails userdetail = new UserDetails(firstName);
        UserRegistration registration = new UserRegistration();
        registration.register(userdetail);
    }
}