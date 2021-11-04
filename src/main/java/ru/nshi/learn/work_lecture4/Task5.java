package ru.nshi.learn.work_lecture4;

import ru.nshi.learn.work2.Task1;

public class Task5 {
    public static void main(String[] Args){

        Task1 valueBased = new Task1();
        Task5 value5 = new Task5();

        int[] array1 = new int[10];
        int[] array2 = new int[3];
        array1 = valueBased.randomArray(array1);
        array2 = valueBased.randomArray(array2);
        System.out.println("Исходные массивы:");
        System.out.println("Первый");
        valueBased.printArray(array1);
        System.out.println("Второй");
        valueBased.printArray(array2);
        if(value5.checkSubarray(array2, array1))
            System.out.println("Один из массивов является подмассивом другого");
        else
            System.out.println("Это два разных массива");

    }


    public boolean checkSubarray(int[] array2, int[] array1){
        int count=0;
        for(int i=0; i < array1.length-array2.length+1; i++){
            if(array1[i] == array2[0]){
                count++;
                for(int j=1; j < array2.length; j++){
                    if(array2[j] == array1[i+j]){
                        count++;
                    }
                }
            }
        }
        if(count == array2.length){
            return true;
        }
        return false;
    }
}
