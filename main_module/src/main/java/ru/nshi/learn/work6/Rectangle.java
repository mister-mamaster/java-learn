package ru.nshi.learn.work6;

public class Rectangle extends Figure {
    protected final double[] sides = new double[4];

    public Rectangle(double[] sides){
        if((sides[0] > 0 && sides[1] > 0 && sides[2] > 0 && sides[3] > 0) &&
                (sides[0] == sides[2] && sides[1] == sides[3])) {
            this.sides[0] = sides[0];
            this.sides[1] = sides[1];
            this.sides[2] = sides[2];
            this.sides[3] = sides[3];
            for(int i = 1; i < sides.length; i++){
                if(this.sides[0] != this.sides[i] || i == 3){
                    this.area = this.sides[0] * this.sides[i];
                }
            }
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
        return str + "Длины сторон " + this.sides[0] + ", " + this.sides[1] + ", " + this.sides[2] + ", " + this.sides[3] + "\n";
    }
}
