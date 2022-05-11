package ru.nshi.learn.work2;

import java.util.Random;

public class Task1 {
public static void main(String[] Args){
    Task1 value=new Task1();
    int[] numbers=value.newArray(5);
    numbers=value.randomArray(numbers);
    value.printArray(numbers);
}



public int[] newArray(int length){
    int[] array=new int[length];
    return array;
}


public int[] randomArray(int[] array){
    Random rand=new Random();
    for(int i=0; i<array.length; i++){
        array[i]=rand.nextInt(90)+10;
        }
    return array;
}


public void printArray(int[] array){
    for(int i=0; i<array.length; i++){
        System.out.print(array[i]+" ");
    }
}
}
