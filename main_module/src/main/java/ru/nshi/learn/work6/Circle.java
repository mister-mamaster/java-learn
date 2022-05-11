package ru.nshi.learn.work6;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Colour colour){
        super(colour);
        if(radius > 0) {
            this.radius = radius;
            this.area = 3.14 * Math.pow(radius, 2);
        }
        else{
            this.radius = -1;
            throw new IllegalArgumentException();
        }
        }

    public double getRadius() {
        return radius;
    }

    @Override
    public String info(){
        String str = super.info();
        return str + "Радиус - " + this.radius + "\n";
    }
}
