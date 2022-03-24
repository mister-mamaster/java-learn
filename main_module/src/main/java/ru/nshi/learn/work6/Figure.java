package ru.nshi.learn.work6;

public class Figure {
    public int[] color = new int[3];

    public Figure(){
        try{
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException ex){
            ex.printStackTrace();
        }
    }

    public Figure(int red, int green, int blue){
        if((red >= 0 && red <= 255) & (green >= 0 && green <= 255) & (blue >= 0 && blue <= 255)) {
            this.color[0] = red;
            this.color[1] = green;
            this.color[2] = blue;
        }
        else {
            try{
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException ex){
                ex.printStackTrace();
            }
        }
    }

    public int[] getColor() {
        return color;
    }
}
