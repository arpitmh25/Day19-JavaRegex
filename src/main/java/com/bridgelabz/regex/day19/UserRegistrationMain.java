package com.bridgelabz.regex.day19;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FirstName: ");
        String firstName = scanner.next();
        System.out.println("Enter LastName: ");
        String lastName = scanner.next();
        System.out.println("Enter Email: ");
        String email = scanner.next();
        System.out.println("Enter PhoneNumber");
        String number = scanner.next();
        System.out.println("Enter Password: ");
        String password = scanner.next();
        User userdetail = new User(firstName, lastName, email, number, password);
        UserRegistration registration = new UserRegistration();
        registration.register(userdetail);
    }
}