package ru.nshi.learn.work6;

public class Triangle extends Figure {
    private final double[] sides = new double[3];

    public Triangle(double[] sides, Colour colour){
        super(colour);
        if((sides[0] > 0 && sides[1] > 0 && sides[2] > 0) &&
                (((sides[0]+sides[1])>sides[2]) && ((sides[0] + sides[2])>sides[1]) && ((sides[1] + sides[2])>sides[0]))) {
            this.sides[0] = sides[0];
            this.sides[1] = sides[1];
            this.sides[2] = sides[2];
            double P = (this.sides[0] + this.sides[1] + this.sides[2])/2;
            this.area = Math.pow(P * (P - this.sides[0]) * (P - this.sides[1]) * (P - this.sides[2]), 0.5);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public double[] getSides(){
        return sides;
    }

    @Override
    public String info(){
        String str = super.info();
        return str + "Длины сторон " + this.sides[0] + ", " + this.sides[1] + ", " + this.sides[2] + "\n";
    }
}
