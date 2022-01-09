package com.bridgelabz.regex.day19;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First-Name: ");
        String firstName = sc.next();
        System.out.println("Enter Last-Name: ");
        String lastName = sc.next();
        System.out.println("Enter Email: ");
        String email = sc.next();
        User userdetail = new User(firstName, lastName, email);
        UserRegistration registration = new UserRegistration();
        registration.register(userdetail);
    }
}