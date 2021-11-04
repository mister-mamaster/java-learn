package ru.nshi.learn.work_lecture4;

import ru.nshi.learn.work2.Task1;

public class Task6 {
    public static void main(String[] Args){

        Task1 valueBased = new Task1();
        Task6 value6 = new Task6();

        int[] array = new int[10];
        array = valueBased.randomArray(array);
        System.out.println("Исходный массив:");
        valueBased.printArray(array);
        array = value6.arrSum(array);
        System.out.println("\nИтоговый массив:");
        valueBased.printArray(array);
    }


    public int[] arrSum(int[] array1){
        int[] array2 = new int[array1.length];
        for(int index1=0; index1 < array1.length; index1++){
            for(int index2=0; index2 <= index1; index2++){
                array2[index1] += array1[index2];
            }
        }
        return array2;
    }
}
