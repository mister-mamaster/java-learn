package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    void circleTest(){
        Circle circle = new Circle(4,5,6,4.7);
        circle.setArea();
        double area = circle.getArea();
        circle.info();
        assertEquals(69.36260000000001, area);
    }

    @Test
    void circleExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(4, -5, 6, 7);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(4, 5, 6, -7);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Circle circle = new Circle(500, 5, 6, 7);
        });
    }
}
