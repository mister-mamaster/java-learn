package ru.nshi.learn.work6;

public class Square extends Rectangle {

    public Square(){
        super();
    }

    public Square(double[] sides, int red, int green, int blue){
        super(sides, red, green, blue);
    }

    @Override
    public double getArea() {
        return this.sides[0];
    }
}
