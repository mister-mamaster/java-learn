package ru.nshi.learn.work6;

public abstract class Figure {
    protected Colour colour;
    protected double area;

    public Figure(Colour colour){
        this.colour = colour;
        this.area = -1;
    }

    public double getArea(){
        return this.area;
    }

    public Colour getColour() {
        return colour;
    }

    public String info(){
        return "Объект типа " + this.getClass().getSimpleName() + "\nЦвет - " + this.colour.toString() + "\nПлощадь фигуры - " + this.area + "\n";
    }
}
