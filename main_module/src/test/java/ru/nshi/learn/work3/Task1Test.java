package ru.nshi.learn.work3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {

    Task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1();
    }

    @Test
    void test1SumLine(){
        int[][] array = {{1,1,1,2},{2,6,3,2},{9,9,9,3},{5,4,7,7}};
        int[] sums = {5,13,30,23};
        int[] mSums = task1.sumLine(array);
        assertArrayEquals(sums, mSums);
    }

    @Test
    void test2SumLine(){
        int[][] array = {{5,3,1,2},{2,9,3,0},{9,0,5,3},{5,4,8,7}};
        int[] sums = {11,14,17,24};
        int[] mSums = task1.sumLine(array);
        assertArrayEquals(sums, mSums);
    }

}
