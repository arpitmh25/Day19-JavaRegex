package com.bridgelabz.regex.day19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String FIRST_NAME = "^[A-Z][a-z]{3,}";
    private static final String LAST_NAME = "^[A-Z][a-z]{3,}";
    private static final String EMAIL = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[a-z]+$";
    private static final String PHONE_NUMBER = "^[0-9]{2}[\\s][0-9]{10}$";
    private static final String PASSWORD = "(?=.*[A-Z])[A-Za-z]{8,}$";

    public void register(User userDetail) {

        boolean isFirstNameValid = validateUserDetails(FIRST_NAME, userDetail.getFirstName());
        boolean isLastNameValid = validateUserDetails(LAST_NAME, userDetail.getLastName());
        boolean isEmailValid = validateUserDetails(EMAIL, userDetail.getEmail());
        boolean isPhoneNumberValid = validateUserDetails(PHONE_NUMBER, userDetail.getPhoneNumber());
        boolean isPasswordValid = validateUserDetails(PASSWORD, userDetail.getPassword());

        if (isFirstNameValid && isLastNameValid && isEmailValid && isPasswordValid) {
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