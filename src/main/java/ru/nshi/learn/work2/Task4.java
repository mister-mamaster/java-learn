package ru.nshi.learn.work2;


public class Task4 {
    public static void main(String[] Args){
    Task1 value=new Task1();
    int[] numbers=value.newArray(10);
    numbers=value.randomArray(numbers);
    int max=value.maxArray(numbers), min=value.minArray(numbers);
    numbers[max]+=numbers[min];
    numbers[min]=numbers[max]-numbers[min];
    numbers[max]-=numbers[min];
    }
}
