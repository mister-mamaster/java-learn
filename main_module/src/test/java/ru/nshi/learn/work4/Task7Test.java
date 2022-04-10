package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task7Test {

    Task7 task7;

    @BeforeEach
    void setUp() {
        task7 = new Task7();
    }

    @Test
    void test1UniSymArr(){
        String data = "Четыре чёрненьких чернявеньких чертёнка чертили чёрными чернилами чертёж";
        String result = task7.uniSymWord(data);
        String actual_result = "чёрненьких";
        assertEquals(actual_result, result);
    }

    @Test
    void test2UniSymArr(){
        String data = "kghgfgkefg mnfl;jzifue  gggefeeefhjhn";
        String result = task7.uniSymWord(data);
        String actual_result = "mnfl;jzifue";
        assertEquals(actual_result, result);
    }

}
