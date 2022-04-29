package ru.nshi.learn.work6;

public class Rectangle extends Figure {
    protected final double lenght;
    protected final double width;

    public Rectangle(double lenght, double width){
        if(lenght > 0 && width > 0) {
            this.lenght = lenght;
            this.width = width;
            this.area = this.lenght * this.width;
            }
        else{
            throw new IllegalArgumentException();
        }
    }

    public double getLenght() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String info(){
        String str = super.info();
        return str + "Длины сторон " + this.lenght + ", " + this.width + "\n";
    }
}
