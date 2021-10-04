package ru.nshi.learn.work2;

import java.util.Random;

public class Task3 {
    public static void main(String[] Args){
    Random rand=new Random();
    int[] numbers= new int[10];
    int max=0, min=150;
    for(int i=0; i<10; i++){
     numbers[i]=rand.nextInt(90)+10;
     if(numbers[i]>max){
        max=numbers[i];
     }
     if(numbers[i]<min){
        min=numbers[i];
     }
    }
    System.out.print("Максимальное число: "+max+"\nМинимальное число: "+min);
    }
}
