package org.example.homework0308;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {
    int[] testArr;

    @org.junit.jupiter.api.Test
    void run() {
    }

    @org.junit.jupiter.api.Test
    void initializeWinningNumbers_test() {
        testArr = Lottery.initializeWinningNumbers();
        assertEquals(5, testArr.length);
    }

    @org.junit.jupiter.api.Test
    public void testIsThisNumberPresentInArray_NumberPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int targetNumber = 3;

        boolean result = Lottery.isThisNumberPresentInArray(targetNumber, array);

        assertTrue(result);
    }


    @org.junit.jupiter.api.Test
    void isThisNumberPresentInArray_NumberNotPerenttest() {
        int[] array = {1, 2, 3, 4, 5};
        int targetNumber = 6;

        boolean result = Lottery.isThisNumberPresentInArray(targetNumber, array);

        assertFalse(result);
    }


    @org.junit.jupiter.api.Test
    public void IsThisNumberPresentInArray_EmptyArraytest() {
        int[] array = {};
        int targetNumber = 3;

        boolean result = Lottery.isThisNumberPresentInArray(targetNumber, array);

        assertFalse(result);
    }
}