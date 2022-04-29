package ru.nshi.learn.work6;

public abstract class Figure {
    protected Colour colour = new Colour();
    protected double area;

    public Figure(){
            this.area = -1;
    }

    public double getArea(){
        return this.area;
    }

    public Colour getcolour() {
        return colour;
    }

    public String info(){
        return "Объект типа " + this.getClass().getSimpleName() + "\nЦвет - " + this.colour.getColors() + "\nПлощадь фигуры - " + this.area + "\n";
    }
}
