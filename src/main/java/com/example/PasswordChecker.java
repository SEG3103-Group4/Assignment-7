package com.example;

public class PasswordChecker {

    /**
     * Checks if a password is "strong" based on a set of rules
     * A strong password must:
     * 1. Be at least 8 characters long
     * 2. Contain at least one number
     * 3. Contain at least one uppercase letter
     *
     * @param password The password string to check
     * @return true if the password is strong, false otherwise. Returns false for null input
     */
    public static boolean isStrong(String password) {
        // Rule: Handle null or invalid input gracefully.
        if (password == null) {
            return false;
        }

        // Rule 1: Must be at least 8 characters long.
        boolean isLongEnough = password.length() >= 8;

        // Rule 2: Must contain at least one number.
        boolean hasNumber = password.chars().anyMatch(Character::isDigit);

        // Rule 3: Must contain at least one uppercase letter.
        boolean hasUppercase = password.chars().anyMatch(Character::isUpperCase);

        // All rules must be true for the password to be strong.
        return isLongEnough && hasNumber && hasUppercase;
    }
}