package ru.nshi.learn.work2;

public class Task2 {
    public static void main(String[] Args){
        Task1 value=new Task1();
        int[] numbers=value.newArray(10);
        numbers=value.randomArray(numbers);
        int sum=value.sumArrayAft0(numbers);
        System.out.println(sum);
    }
}
