package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task2Test{

    Task2 task2;

    @BeforeEach
    void setUp() {
        task2 = new Task2();
    }

    @Test
    void test1Capit(){
        String data = "ЭвО кАк";
        String str = task2.capit(data);
        String actual_str = "ЭОА";
        assertEquals(str, actual_str);
    }

    @Test
    void test2Capit(){
        String data = "ВоТ тАК";
        String str= task2.capit(data);
        String actual_str = "ВТАК";
        assertEquals(str, actual_str);
    }

}
