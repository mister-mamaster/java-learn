package ru.nshi.learn.work6;

public class Triangle extends Figure {
    private final double[] sides = new double[3];

    public Triangle(double[] sides, int red, int green, int blue){
        super(red, green, blue);
        if((sides[0] > 0 && sides[1] > 0 && sides[2] > 0) &&
                (((sides[0]+sides[1])>sides[2]) && ((sides[0] + sides[2])>sides[1]) && ((sides[1] + sides[2])>sides[0]))) {
            this.sides[0] = sides[0];
            this.sides[1] = sides[1];
            this.sides[2] = sides[2];
        }
        else{
            try{
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException ex){
                ex.printStackTrace();
                throw new IllegalArgumentException();
            }
        }
    }

    public void setArea(){
        double P = (this.sides[0] + this.sides[1] + this.sides[2])/2;
        this.area = Math.pow(P * (P - this.sides[0]) * (P - this.sides[1]) * (P - this.sides[2]), 0.5);
    }

    public double[] getSides(){
        return sides;
    }

    @Override
    public void info(){
        super.info();
        System.out.println("Длины сторон " + this.sides[0] + ", " + this.sides[1] + ", " + this.sides[2]);
    }
}
