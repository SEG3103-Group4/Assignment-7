package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    // Test for the main success case
    @Test
    void isStrong_ReturnsTrue_ForAllConditionsMet() {
        assertTrue(PasswordChecker.isStrong("Password123"));
    }

    // --- Red-Green-Refactor Cycle Tests ---

    @Test
    void isStrong_ReturnsFalse_IfLessThan8Chars() {
        assertFalse(PasswordChecker.isStrong("weak"));
    }


    @Test
    void isStrong_ReturnsTrue_IfAtLeast8CharsAndOtherConditionsMet() {
        assertTrue(PasswordChecker.isStrong("StrongEnough1"));
    }

    @Test
    void isStrong_ReturnsFalse_IfNoNumber() {
        assertFalse(PasswordChecker.isStrong("Strongpass"));
    }

    @Test
    void isStrong_ReturnsFalse_IfNoUppercase() {
        assertFalse(PasswordChecker.isStrong("strong123"));
    }


    // --- Edge Case Tests ---

    @Test
    void isStrong_ReturnsFalse_ForNullInput() {
        assertFalse(PasswordChecker.isStrong(null));
    }

    @Test
    void isStrong_ReturnsFalse_ForEmptyString() {
        assertFalse(PasswordChecker.isStrong(""));
    }

    @Test
    void isStrong_ReturnsFalse_For7CharsWithNumberAndUppercase() {
        assertFalse(PasswordChecker.isStrong("Pass123"));
    }
}