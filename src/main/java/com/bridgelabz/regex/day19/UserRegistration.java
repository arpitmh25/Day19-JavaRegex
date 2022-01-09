package com.bridgelabz.regex.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME = "^[A-Z][a-z]{3,}";
    private static final String LAST_NAME = "^[A-Z][a-z]{3,}";
    private static final String EMAIL = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-z]+$";

    public void register(User userDetail) {

        boolean isFirstNameValid = validateUserDetails(FIRST_NAME, userDetail.getFirstName());
        boolean isLastNameValid = validateUserDetails(LAST_NAME, userDetail.getLastName());
        boolean isEmailValid = validateUserDetails(EMAIL, userDetail.getEmail());

        if (isFirstNameValid && isLastNameValid && isEmailValid) {
            System.out.println("Details entered are valid");
        } else {
            System.out.println("Details entered are invalid");

        }

    }

    private boolean validateUserDetails(String regex, String dataToBeValidated) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dataToBeValidated);
        return matcher.matches();
    }
}