package ru.nshi.learn.work3;

public class Task2 {
    public static void main(String[] Args){
    Task1 value1=new Task1();
    Task2 value2=new Task2();
    int[][] matrix=new int[10][10];
    matrix=value1.randMrx();
    System.out.println("Исходный массив:");
    value1.printMatrix(matrix);
    int[] sum=value2.sumCln(matrix);
    System.out.println("Суммы стольцов:");
    for(int i=0; i<10; i++){
        System.out.println(sum[i]);
    }
    }


    public int[] sumCln(int[][] matrix){
        int[] sum=new int[10];
        for(int i2=0; i2<10; i2++){
            for(int i1=0; i1<10; i1++){
                sum[i2]+=matrix[i1][i2];
            }
        }
        return sum;
    }
}
