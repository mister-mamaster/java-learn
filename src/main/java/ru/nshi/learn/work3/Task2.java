package ru.nshi.learn.work3;

public class Task2 {
    public static void main(String[] Args){
    Task1 value1=new Task1();
    Task2 value2=new Task2();
    int[][] matrix=value1.randMrx(10);
    System.out.println("Исходный массив:");
    value1.printMatrix(matrix);
    int[] sum=value2.sumCln(matrix);
    System.out.println("Суммы столбцов:");
    for(int index=0; index<10; index++){
        System.out.println(sum[index]);
    }
    }


    public int[] sumCln(int[][] matrix){
        int[] sum=new int[matrix.length];
        for(int column=0; column<10; column++){
            for(int line=0; line<10; line++){
                sum[column]+=matrix[line][column];
            }
        }
        return sum;
    }
}
