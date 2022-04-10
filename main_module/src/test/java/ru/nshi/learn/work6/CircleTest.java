package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    void circleTest(){
        Circle circle = new Circle(4);
        double area = circle.getArea();
        circle.setColorHSB(1,2,3);
        System.out.print(circle.info());
        assertEquals(50.24, area);
    }

    @Test
    void circleExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(4);
            circle.setColorRGB(100, -2, 200);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(4);
            circle.setColorRGB(300, 100, 100);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(-500);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(1);
            circle.setColorHSB(-1, 10, 10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(1);
            circle.setColorHSB(1, 101, 101);
        });
    }
}
