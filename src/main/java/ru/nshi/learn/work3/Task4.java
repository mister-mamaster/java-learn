package ru.nshi.learn.work3;

public class Task4{
    public static void main(String[] Args){
        Task1 value1=new Task1();
        Task4 value4=new Task4();
        int[][] matrix=new int[10][10];
        matrix=value1.randMrx();
        System.out.println("Исходный массив:");
        value1.printMatrix(matrix);
        matrix=value4.Sort(matrix);
        System.out.println("Отсортированный массив:");
        value1.printMatrix(matrix);
    }


    public int[][] Sort(int[][] matrix) {
        int min;
        for(int i1=0; i1<10; i1++){
            for(int i2=0; i2<10; i2++){
                for(int num1=0; num1<10; num1++){
                    for(int num2=0; num2<10; num2++){
                        if(matrix[num1][num2]>matrix[i1][i2]){
                            int buff = matrix[i1][i2];
                            matrix[i1][i2] = matrix[num1][num2];
                            matrix[num1][num2] = buff;
                        }

                    }
                }
            }
        }
        return matrix;
    }
}
