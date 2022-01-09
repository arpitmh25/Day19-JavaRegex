package com.bridgelabz.regex.day19;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FirstName:");
        String firstName = sc.next();
        System.out.println("Enter LastName:");
        String lastName = sc.next();
        User userdetails = new User(firstName , lastName);
        UserRegistration registration = new UserRegistration();
        registration.register(userdetails);
    }
}