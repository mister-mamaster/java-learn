package ru.nshi.learn.work2;

import java.util.Random;

public class Task2 {
    public static void main(String[] Args){
        Task1 value=new Task1();
        Task2 value2=new Task2();
        int[] numbers=value.newArray(10);
        numbers=value2.randArray(numbers);
        int sum=value.sumArrayAft0(numbers);
        System.out.println(sum);
    }
    public int[] randArray(int[] array){
        Random rand=new Random();
        for(int i=0; i<array.length; i++){
            array[i]=rand.nextInt(102)-50;
            }
        return array;
    }
}
