package ru.nshi.learn.work3;

public class Task4{
    public static void main(String[] Args){
        Task1 value1 = new Task1();
        Task4 value4 = new Task4();
        int[][] matrix = value1.randMrx(10);
        System.out.println("Исходный массив:");
        value1.printMatrix(matrix);
        matrix = value4.Sort(matrix);
        System.out.println("Отсортированный массив:");
        value1.printMatrix(matrix);
    }


    public int[][] Sort(int[][] matrix) {
        int[] array = new int[matrix.length*matrix.length];
        int index = 0;
        for(int line = 0; line < matrix.length; line++){
            for(int column = 0; column < matrix.length; column++){
                array[index] = matrix[line][column];
                index++;
            }
        }
        for (int left = 0; left < array.length; left++) {
            int min = left;
            for (index = left; index < array.length; index++) {
                if (array[index] < array[min]) {
                    min = index;
                }
            }
            int buff = array[left];
            array[left] = array[min];
            array[min] = buff;
        }
        index = 0;
        for(int line = 0; line < matrix.length; line++){
            for(int column = 0; column < matrix.length; column++){
                matrix[line][column] = array[index];
                index++;
            }
        }
        return matrix;
    }
}
