package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test{

    Task1 task1;

    @BeforeEach
    void setUp() {
        task1 = new Task1();
    }

    @Test
    void test1CutString(){
        String data = "Эво как";
        String[] str = task1.cutString(data);
        String[] actual_str = {"Э","Эв","Эво","Эво ","Эво к","Эво ка","Эво как"};
        assertArrayEquals(str, actual_str);
    }

    @Test
    void test2CutString(){
        String data = "Вот так";
        String[] str = task1.cutString(data);
        String[] actual_str = {"В","Во","Вот","Вот ","Вот т","Вот та","Вот так"};
        assertArrayEquals(str, actual_str);
    }

}
