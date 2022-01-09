package com.bridgelabz.regex.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String First_Name = "^[A-Z][a-z]{3,}";

    public void register(UserDetails userDetail) {
        validateUserDetails(userDetail);
    }

    private void validateUserDetails(UserDetails userDetail) {
        Pattern pattern = Pattern.compile(First_Name);
        Matcher matcher = pattern.matcher(userDetail.getFirstName());
        boolean isValid = matcher.matches();

        if (isValid) {
            System.out.println("Name is valid");
        } else {
            System.out.println("Name is not valid");
        }
    }
}