package ru.nshi.learn.work3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test {

    Task2 task2;

    @BeforeEach
    void setUp() {
        task2 = new Task2();
    }

    @Test
    void test1SumLine(){
        int[][] array = {{1,1,1,2},{2,6,3,2},{9,9,9,3},{5,4,7,7}};
        int[] sums = {17,20,20,14};
        int[] mSums = task2.sumCln(array);
        assertArrayEquals(mSums, sums);
    }

    @Test
    void test2SumLine(){
        int[][] array = {{5,3,1,2},{2,9,3,0},{9,0,5,3},{5,4,8,7}};
        int[] sums = {21,16,17,12};
        int[] mSums = task2.sumCln(array);
        assertArrayEquals(mSums, sums);
    }

}
