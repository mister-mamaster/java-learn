package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    @Test
    void squareTest(){
        double[] sides = {3, 3, 3, 3};
        Square square = new Square(sides , 2 , 3, 4);
        square.setArea();
        assertEquals(9, square.getArea());
        square.info();
    }

    @Test
    void squareExceptionTest(){
        double[] sides1 = {0, 0, 0, 0};
        assertThrows(IllegalArgumentException.class, () -> {
            Square square = new Square(sides1, 5, 6, 7);
        });
        double[] sides2 = {2, 3, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            Square square = new Square(sides2, 5, 6, 7);
        });
    }
    
}
