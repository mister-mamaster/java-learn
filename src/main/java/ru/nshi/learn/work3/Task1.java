package ru.nshi.learn.work3;

import java.util.Random;

public class Task1 {
    public static void main(String[] Args){
    Task1 value=new Task1();
    int[][] matrix=new int[10][10];
    matrix=value.randMrx();
    System.out.println("Исходный массив:");
    value.printMatrix(matrix);
    int[] sum=value.sumLine(matrix);
    System.out.println("Суммы строк:");
    for(int i=0; i<10; i++){
        System.out.println(sum[i]);
    }
    }


    public int[][] randMrx(){
        Random rand=new Random();
        int[][] matrix=new int[10][10];
        for(int i1=0; i1<10; i1++){
            for(int i2=0; i2<10; i2++){
                matrix[i1][i2]=rand.nextInt(100);
            }
        }
        return matrix;
    }

    public int[] sumLine(int[][] matrix){
        int[] sum=new int[10];
        for(int i1=0; i1<10; i1++){
            for(int i2=0; i2<10; i2++){
                sum[i1]+=matrix[i1][i2];
            }
        }
        return sum;
    }

    public void printMatrix(int[][] matrix){
        for(int i1=0; i1<10; i1++){
            for(int i2=0; i2<10; i2++){
                System.out.printf("%4d", matrix[i1][i2]);
            }
            System.out.println();
        }
    }
}
