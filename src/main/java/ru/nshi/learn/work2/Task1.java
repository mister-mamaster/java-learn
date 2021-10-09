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
public int maxArray(int[] array){
    int max=150;
    for(int i=0; i<10; i++){
        if(array[i]>max){
           max=array[i];
        }
        }
    return max;
}
public int minArray(int[] array){
    int min=0;
    for(int i=0; i<10; i++){
        if(array[i]<min){
           min=array[i];
        }
}
    return min;
}
public int sumArrayAft0(int[] array){
    int sum=0;
    for(int i=0; i<10; i++){
        if(array[i]>0){
            sum+=array[i];
        }
        }
    return sum;
}
public void arfArray(int[] array){
    int imax=0, imin=0, i;
    float max=0, min=150, sum=0;
    for(i=0; i<10; i++){
        if(array[i]>max){
            max=array[i];
            imax=i;
        }
        if(array[i]<min){
            min=array[i];
            imin=i;
        }
        }
        if(imax>imin){
        for(i=imin; i<=imax; i++){
            sum+=array[i];}
        System.out.print(sum/(imax-imin));
        }
        if(imin>imax){
            for(i=imax; i<=imin; i++){
                sum+=array[i];}
            System.out.print(sum/(imin-imax));
        }
}
}
