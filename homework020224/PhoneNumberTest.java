package org.example.homework020224;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberTest {
    private NumberChecker numberChecker;
@BeforeEach
    public void init(){
    numberChecker = new NumberChecker();
    }

    @Test
    public void correctPhoneNumberTest(){
    assertTrue(numberChecker.isCorrectNumber("2345678"));
    assertTrue(numberChecker.isCorrectNumber("23 45678"));
    assertTrue(numberChecker.isCorrectNumber("23-45678"));
    }

    @Test
    public void incorrectPhoneNumberTest(){
    assertFalse(numberChecker.isCorrectNumber("1234567"));
    assertFalse(numberChecker.isCorrectNumber("1234-567"));
    assertFalse(numberChecker.isCorrectNumber("123 4567"));
    }
}
