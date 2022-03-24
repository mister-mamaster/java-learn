package ru.nshi.learn.work6;

public class Triangle extends Figure {
    public final double[] sides = new double[3];

    public Triangle(){
        super();
    }

    public Triangle(double[] sides, int red, int green, int blue){
        super(red, green, blue);
        if(sides[0] > 0 && sides[1] > 0 && sides[2] > 0) {
            this.sides[0] = sides[0];
            this.sides[1] = sides[1];
            this.sides[2] = sides[2];
        }
        else{
            try{
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException ex){
                ex.printStackTrace();
            }
        }
    }

    public double getArea(){
        double p = (this.sides[0] + this.sides[1] + this.sides[2])/2;
        return Math.sqrt(p*(p-this.sides[0])*(p-this.sides[1])*(p-this.sides[2]));
    }

    public double[] getSides(){
        return sides;
    }
}
