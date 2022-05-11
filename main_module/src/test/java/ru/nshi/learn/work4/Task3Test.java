package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Task3Test{

    Task3 task3;

    @BeforeEach
    void setUp() {
        task3 = new Task3();
    }

    @Test
    void test1NumOfTex(){
        String data = "33 к0р0вь1";
        int[] result = task3.numOfTex(data);
        int[] actual_result = {3,3,0,0,1};
        assertArrayEquals(actual_result, result);
    }

    @Test
    void test2NumOfTex(){
        String data = "34 п0пуга9";
        int[] result = task3.numOfTex(data);
        int[] actual_result = {3,4,0,9};
        assertArrayEquals(actual_result, result);
    }


}
