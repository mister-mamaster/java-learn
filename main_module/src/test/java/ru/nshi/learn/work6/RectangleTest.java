package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void rectangleTest(){
        double[] sides1 = {2, 3, 2, 3};
        Rectangle rectangle1 = new Rectangle(sides1);
        assertEquals(6, rectangle1.getArea());
        System.out.print(rectangle1.info());

        double[] sides2 = {2, 2, 2, 2};
        Rectangle rectangle2 = new Rectangle(sides2);
        assertEquals(4, rectangle2.getArea());
        System.out.print(rectangle2.info());
    }

    @Test
    void rectangleExceptionTest(){
        double[] sides1 = {0, 2, 0, 2};
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle rectangle = new Rectangle(sides1);
        });
        double[] sides2 = {1, 2, 3, 4};
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle rectangle = new Rectangle(sides2);
        });
    }
}
