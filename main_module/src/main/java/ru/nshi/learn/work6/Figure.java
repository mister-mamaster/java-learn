package ru.nshi.learn.work6;

public class Figure {
    protected int[] colorRGB = new int[3];
    protected double area;

    public Figure(int red, int green, int blue){
        if((red >= 0 && red <= 255) & (green >= 0 && green <= 255) & (blue >= 0 && blue <= 255)) {
            this.colorRGB[0] = red;
            this.colorRGB[1] = green;
            this.colorRGB[2] = blue;
        }
        else {
            try{
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException ex){
                ex.printStackTrace();
                throw new IllegalArgumentException();
            }
        }
    }

    public void setcolorRGB(int red, int green, int blue){
        if((red >= 0 && red <= 255) & (green >= 0 && green <= 255) & (blue >= 0 && blue <= 255)) {
            this.colorRGB[0] = red;
            this.colorRGB[1] = green;
            this.colorRGB[2] = blue;
        }
        else {
            try{
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException ex){
                ex.printStackTrace();
                throw new IllegalArgumentException();
            }
        }
    }

    public double getArea(){
        return this.area;
    }

    public int[] getcolorRGB() {
        return colorRGB;
    }

    public void info(){
        System.out.println("Объект типа " + this.getClass().getSimpleName() + "\nred - " + this.colorRGB[0] + ", green - " + this.colorRGB[1] + ", blue - " + this.colorRGB[2]
        + "\nПлощадь фигуры - " + this.area);
    }
}
