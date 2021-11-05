package ru.nshi.learn.work_lecture4;

import java.util.Random;
import ru.nshi.learn.work2.Task1;

public class Task7 {

    public static void main(String[] Args){

        Task1 valueBased = new Task1();
        Task7 value7 = new Task7();

        int[] array = new int[2000];
        array = value7.bigRandomArray(array);
        System.out.println("Массив:");
        valueBased.printArray(array);
        int[] count = value7.countNumber(array);
        System.out.println("В массиве " + count[0] + " однозначных чисел, " + count[1] + " двухзначных, " + count[2] + " трёхзначных и " + count[3] + " четырёхзначных");
    }


    public int[] bigRandomArray(int[] array){
        Random rand=new Random();
        for(int i=0; i<array.length; i++){
            array[i]=rand.nextInt(10000);
        }
        return array;
    }

    public int[] countNumber(int[] array){
        int[] numbers = new int[4];
        for(int i: array){
            if((array[i] >= 0) && (array[i] < 10)){
                numbers[0]++;
            }
            if((array[i] >= 10) && (array[i] < 100)){
                numbers[1]++;
            }
            if((array[i] >= 100) && (array[i] < 1000)){
                numbers[2]++;
            }
            if((array[i] >= 1000) && (array[i] < 10000)){
                numbers[3]++;
            }
        }
        return numbers;
    }
}


