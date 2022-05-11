package ru.nshi.learn.work6;

public class HSB extends Colour {
    int hue;
    int saturation;
    int brightness;

    HSB(int hue, int saturation, int brightness){
        if((hue >= 0 && hue <= 360) & (saturation >= 0 && saturation <= 100) & (brightness >= 0 && brightness <= 100)) {
            this.hue = hue;
            this.saturation = saturation;
            this.brightness = brightness;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString()
    {
        return "hue = " + hue + "\n" + "saturation = " + saturation + "\n" + "brightness = " + brightness;
    }

}
