package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Task4Test{

    Task4 task4;

    @BeforeEach
    void setUp() {
        task4 = new Task4();
    }

    @Test
    void test1SumOfTex(){
        String data = "33 к0р0вь1";
        int result = task4.sumOfTex(data);
        int actual_result = 7;
        assertEquals(actual_result, result);
    }

    @Test
    void test2SumOfTex(){
        String data = "34 п0пуга9";
        int result = task4.sumOfTex(data);
        int actual_result = 16;
        assertEquals(actual_result, result);
    }

}
