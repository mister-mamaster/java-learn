package ru.nshi.learn.work2;

public class Task3 {
    public static void main(String[] Args){
    Task1 value=new Task1();
    int[] numbers=value.newArray(10);
    numbers=value.randomArray(numbers);
    System.out.print("Максимальное число: "+value.maxArray(numbers)+"\nМинимальное число: "+value.minArray(numbers));
    }
}
