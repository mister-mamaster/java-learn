package ru.nshi.learn.work7;

public class Car {
    private final String model;
    private final String makerName;
    private final int modelYear;
    private final String color;

    public Car(String model, String makerName, int modelYear, String color) {
        this.model = model;
        this.makerName = makerName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", makerName=" + makerName +
                ", modelYear='" + modelYear + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getMakerName() {
        return makerName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getColor() {
        return color;
    }
}
