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
    int max=10;
    for(int i=0; i<array.length; i++){
        if(array[i]>=max){
           max=array[i];
        }
        }
    return max;
}
public int minArray(int[] array){
    int min=100;
    for(int i=0; i<array.length; i++){
        if(array[i]<min){
           min=array[i];
        }
}
    return min;
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
public void arfArray(int[] array){
    Task1 value=new Task1();
    int imax=value.imaxArray(array), imin=value.iminArray(array), max=10, min=100, sum=0;
    for(int i=0; i<array.length; i++){
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
            for(int i=imin+1; i<imax; i++){
                sum+=array[i];}
        System.out.print(sum/(imax-imin-1));
        }
        if(imin>imax){
            for(int i=imax+1; i<imin; i++){
                sum+=array[i];}
            System.out.print(sum/(imin-imax-1));
        }
}
public int imaxArray(int[] array){
        Task1 value= new Task1();
        int max=value.maxArray(array);
        for(int i=0; i<array.length; i++){
            if(array[i]==max){
                return i;
            }
        }
        return 0;
}
public int iminArray(int[] array){
    Task1 value= new Task1();
    int min=value.minArray(array);
    for(int i=0; i<array.length; i++){
        if(array[i]==min){
            return i;
        }
    }
    return 0;
}
}
