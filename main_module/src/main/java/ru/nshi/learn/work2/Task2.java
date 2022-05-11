package ru.nshi.learn.work2;

import java.util.Random;

public class Task2 {
    public static void main(String[] Args){
        Task1 value=new Task1();
        Task2 value2=new Task2();
        int[] numbers=value.newArray(10);
        numbers=value2.randArray(numbers);
        int sum=value2.sumArrayAft0(numbers);
        System.out.print("Сумма равна: "+sum+"\nИсходный массив: ");
        value.printArray(numbers);
    }



    public int[] randArray(int[] array){
        Random rand=new Random();
        for(int i=0; i<array.length; i++){
            array[i]=rand.nextInt(101)-50;
            }
        return array;
    }


    public int sumArrayAft0(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            if(array[i]>0){
                sum+=array[i];
            }
            }
        return sum;
    }
}
