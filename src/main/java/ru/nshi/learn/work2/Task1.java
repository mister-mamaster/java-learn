package ru.nshi.learn.work2;

import java.util.Random;

public class Task1 {
public static void main(String[] Args){
    Random rand=new Random();
    int[] numbers= new int[5];
    for(int i=0; i<5; i++){
    numbers[i]=rand.nextInt(90)+10;
    System.out.print(numbers[i]+" ");
    }

}
}
