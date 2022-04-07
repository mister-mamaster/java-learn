package ru.nshi.learn.work6;

public class Square extends Rectangle {

    public Square(double[] sides, int red, int green, int blue){
        super(sides, red, green, blue);
        if(!(sides[0]==sides[1] && sides[1] == sides[2] && sides[2] == sides[3])) {
            try{
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException ex){
                ex.printStackTrace();
                throw new IllegalArgumentException();
            }
        }
    }

    @Override
    public void setArea() {
        this.area = this.sides[0] * this.sides[0];
    }
}
