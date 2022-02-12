package ru.nshi.learn.work1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test{

    Task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1();
    }

    @ParameterizedTest
    @ValueSource(ints = {333333, 456546, 722272})
    void testLucynumber(int number){
        boolean luck = task1.lucynumber(number);
        assertTrue(luck);
    }

    @ParameterizedTest
    @ValueSource(ints = {323333, 486546, 722274})
    void testNotLucynumber(int number){
        boolean luck = task1.lucynumber(number);
        assertFalse(luck);
    }

}
