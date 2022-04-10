package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task5Test {

    Task5 task5;

    @BeforeEach
    void setUp() {
        task5 = new Task5();
    }

    @Test
    void test1UniSym(){
        String data = "33 к0р0вь1";
        String result = task5.uniSym(data);
        String actual_result = " крвь1";
        assertEquals(actual_result, result);
    }

    @Test
    void test2UniSym(){
        String data = "34 п0пуга9";
        String result = task5.uniSym(data);
        String actual_result = "34 0уга9";
        assertEquals(actual_result, result);
    }

}
