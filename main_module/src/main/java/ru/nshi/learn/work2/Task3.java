package ru.nshi.learn.work2;

public class Task3 {
    public static void main(String[] Args){
    Task1 value=new Task1();
    Task3 value3=new Task3();
    int[] numbers=value.newArray(10);
    numbers=value.randomArray(numbers);
    System.out.println("Максимальное число: "+value3.maxArray(numbers)+"\nМинимальное число: "+value3.minArray(numbers));
    System.out.print("Исходный массив: ");
    value.printArray(numbers);
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
}
