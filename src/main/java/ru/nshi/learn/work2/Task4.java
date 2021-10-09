package ru.nshi.learn.work2;


public class Task4 {
    public static void main(String[] Args){
    Task1 value=new Task1();
    int[] numbers=value.newArray(10);
    numbers=value.randomArray(numbers);
    int imax=value.imaxArray(numbers), imin=value.iminArray(numbers);
    numbers[imax]+=numbers[imin];
    numbers[imin]=numbers[imax]-numbers[imin];
    numbers[imax]-=numbers[imin];
    }
}
