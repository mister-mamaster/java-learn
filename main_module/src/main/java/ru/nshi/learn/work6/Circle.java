package ru.nshi.learn.work6;

public class Circle extends Figure {
    private final double radius;

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
                throw new IllegalArgumentException();
            }
        }
    }

    public void setArea(){
        this.area = 3.14 * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Радиус - " + this.radius);
    }
}
