package ru.nshi.learn.work6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {

    @Test
    void squareTest(){
        double[] sides = {3, 3, 3, 3};
        Square square = new Square(3,3, new RGB(1,2,3));
        assertEquals(9, square.getArea());
        System.out.print(square.info());
    }

    @Test
    void squareExceptionTest(){
        double[] sides1 = {0, 0, 0, 0};
        assertThrows(IllegalArgumentException.class, () -> {
            Square square = new Square(0,0, new RGB(1,2,3));
        });
        double[] sides2 = {2, 3, 2, 3};
        assertThrows(IllegalArgumentException.class, () -> {
            Square square = new Square(2,3, new RGB(1,2,3));
        });
    }
    
}
