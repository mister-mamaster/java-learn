package ru.nshi.learn.work6;

public class Circle extends Figure {
    public final double radius;

    public Circle(){
        super();
        this.radius = -1;
    }

    public Circle(int red, int green, int blue, double radius){
        super(red, green, blue);
        if(radius > 0) {
            this.radius = radius;
        }
        else{
            this.radius = -1;
            try{
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException ex){
                ex.printStackTrace();
            }
        }
    }

    public double getArea(){
        return 3.14 * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
