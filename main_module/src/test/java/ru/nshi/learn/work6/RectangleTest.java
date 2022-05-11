package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void rectangleTest(){
        Rectangle rectangle1 = new Rectangle(2, 3, new RGB(1,2,3));
        assertEquals(6, rectangle1.getArea());
        System.out.print(rectangle1.info());

        double[] sides2 = {2, 2, 2, 2};
        Rectangle rectangle2 = new Rectangle(2,2, new RGB(1,2,3));
        assertEquals(4, rectangle2.getArea());
        System.out.print(rectangle2.info());
    }

    @Test
    void rectangleExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            Rectangle rectangle = new Rectangle(0,2, new RGB(1,2,3));
        });
    }
}
