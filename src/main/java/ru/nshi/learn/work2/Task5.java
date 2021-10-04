package ru.nshi.learn.work2;

import java.util.Random;

public class Task5 {
    public static void main(String[] Args){
    Random rand=new Random();
    int[] numbers= new int[10];
    int max=0, min=150, imax=0, imin=0, sum=0, i;
    for(i=0; i<10; i++){
    numbers[i]=rand.nextInt(90)+10;
    if(numbers[i]>max){
        max=numbers[i];
        imax=i;
    }
    if(numbers[i]<min){
        min=numbers[i];
        imin=i;
    }
    }
    if(imax>imin){
    for(i=imin; i<=imax; i++){
        sum+=numbers[i];}
    System.out.print(sum/(imax-imin));
    }
    if(imin>imax){
        for(i=imax; i<=imin; i++){
            sum+=numbers[i];}
        System.out.print(sum/(imin-imax));
    }
 }
}
