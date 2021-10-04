package ru.nshi.learn.work2;

import java.util.Random;

public class Task2 {
    public static void main(String[] Args){
        Random rand=new Random();
        int[] numbers=new int[10];
        int sum=0;
        for(int i=0; i<10; i++){
            numbers[i]=rand.nextInt(101)-50;
            if(numbers[i]>0){
                sum+=numbers[i];
            }
            }
        System.out.println(sum);
    }
}
