package ru.nshi.learn.work6;

public class RGB extends Colour {
    int red;
    int green;
    int blue;

    RGB(int red, int green, int blue){
        if((red >= 0 && red <= 255) & (green >= 0 && green <= 255) & (blue >= 0 && blue <= 255)) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString()
    {
        return "red = " + red +"\n" + "green = " + green + "\n" + "blue = " + blue;
    }


}