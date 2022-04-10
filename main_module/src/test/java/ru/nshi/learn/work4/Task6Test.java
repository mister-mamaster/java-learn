package ru.nshi.learn.work4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {

    Task6 task6;

    @BeforeEach
    void setUp() {
        task6 = new Task6();
    }

    @Test
    void test1UniSymArr(){
        String[] data = {"jfnhy789'r4w+-/1ud0827432476c/dhsag6tc7p;aэьомвшхгу04ц", "fdgh6i7u", "8rshysh6rvfdgj4"};
        String result = task6.uniSymArr(data);
        String actual_result = "jfny9'rw+-1u3sgtp;эьомвшхгуц";
        assertEquals(actual_result, result);
    }

    @Test
    void test2UniSymArr(){
        String[] data = {"f84h4d54v68786sdfew785y7d987", "hgjrsig+98wsa", "qwertyuiopkjhgfdsal"};
        String result = task6.uniSymArr(data);
        String actual_result = "qwertyuiopkjhgfdsal";
        assertEquals(actual_result, result);
    }

}
