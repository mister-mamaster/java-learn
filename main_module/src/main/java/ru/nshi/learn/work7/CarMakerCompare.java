package ru.nshi.learn.work7;

import java.util.Comparator;

class CarMakerCompare implements Comparator<CarMaker> {

    public int compare(CarMaker cm1, CarMaker cm2) {

        return cm1.getName().toUpperCase().compareTo(cm2.getName().toUpperCase());

    }
}