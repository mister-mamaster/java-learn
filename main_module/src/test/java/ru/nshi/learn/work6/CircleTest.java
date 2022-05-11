package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    void circleTest(){
        Colour rgb = new RGB(1, 2, 3);
        Circle circle = new Circle(4, rgb);
        double area = circle.getArea();
        System.out.print(circle.info());
        assertEquals(50.24, area);
    }

    @Test
    void circleExceptionTest(){
        assertThrows(IllegalArgumentException.class, () -> {
            Colour rgb = new RGB(100, -2, 100);
            Circle circle = new Circle(4, rgb);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Colour rgb = new RGB(300, 100, 100);
            Circle circle = new Circle(4, rgb);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Colour rgb = new RGB(300, 100, 100);
            Circle circle = new Circle(-4, rgb);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Colour hsb = new HSB(-1, 100, 100);
            Circle circle = new Circle(4, hsb);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Colour hsb = new HSB(1, 101, 101);
            Circle circle = new Circle(4, hsb);
        });
    }
}
