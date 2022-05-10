package ru.nshi.learn.work7;

import java.util.LinkedList;

public class CarMaker {
    private final String name;
    private LinkedList<String> cars = new LinkedList<String>();

    public CarMaker(String name) {
        this.name = name;
    }

    public CarMaker(String name, LinkedList<String> cars) {
        this.name = name;
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarMaker - {" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }

    public String getName() {
        return name;
    }

    public LinkedList<String> getCars(){
        return cars;
    }

}
