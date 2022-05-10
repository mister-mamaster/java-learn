package ru.nshi.learn.work6;

public class Square extends Rectangle {

    public Square(double lenght, double width, Colour colour){
        super(lenght, width, colour);
        if(lenght!=width) {
            throw new IllegalArgumentException();
        }
        this.area = Math.pow(lenght, 2);
    }
}
