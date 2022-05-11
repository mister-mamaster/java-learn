package ru.nshi.learn.work1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {

    Task3 task3;

    @BeforeEach
    void setUp() {
        task3 = new Task3();
    }

    @ParameterizedTest
    @ValueSource(ints = {11, 19, 23})
    void testSimp(int number){
        boolean simplicity = task3.simp(number);
        assertTrue(simplicity);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 15, 49})
    void testNotSimp(int number){
        boolean simplicity = task3.simp(number);
        assertFalse(simplicity);
    }

}
