package ru.nshi.learn.work3;

import java.util.Random;

public class Task1 {
    public static void main(String[] Args){
        Task1 value = new Task1();
        int[][] matrix = value.randMrx(10);
        System.out.println("Исходный массив:");
        value.printMatrix(matrix);
        int[] sum = value.sumLine(matrix);
        System.out.println("Суммы строк:");
        for(int i = 0; i < sum.length; i++){
            System.out.println(sum[i]);
        }
    }


    public int[][] randMrx(int size){
        Random rand = new Random();
        int[][] matrix = new int[size][size];
        for(int line = 0; line < size; line++){
            for(int column = 0; column < size; column++){
                matrix[line][column] = rand.nextInt(100);
            }
        }
        return matrix;
    }

    public int[] sumLine(int[][] matrix){
        int[] sum = new int[matrix.length];
        for(int line = 0; line < matrix.length; line++){
            for(int column = 0; column < matrix.length; column++){
                sum[line]+= matrix[line][column];
            }
        }
        return sum;
    }

    public void printMatrix(int[][] matrix){
        for(int line = 0; line < matrix.length; line++){
            for(int column = 0; column < matrix.length; column++){
                System.out.printf("%4d", matrix[line][column]);
            }
            System.out.println();
        }
    }
}
