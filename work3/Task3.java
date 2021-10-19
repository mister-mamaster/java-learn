package ru.nshi.learn.work3;


public class Task2 {
    public static void main(String[] Args){
    Task1 value1=new Task1();
    Task3 value3=new Task3();
    int[][] matrix=new int[10][10];
    matrix=value.randMrx();
    System.out.println("Исходный массив:");
    value1.printMatrix(matrix);
    value3.magic(matrix);
    }
    public void magic(int[][] matrix){
        int[] sum=new int[22];
        for(int i1=0; i1<10; i1++){
            for(int i2=0; i2<10; i2++){
                sum[i1]+=matrix[i1][i2];
            }
        }
        for(int i1=0; i1<10; i1++){
            for(int i2=0; i2<10; i2++){
                sum[10+i1]+=matrix[i2][i1];
            }
        }
        for(int i=0; i<10; i++){
            sum[20]+=matrix[i][i];
        }
        for(int i=0; i<10; i++){
            sum[21]+=matrix[9-i][i];
        }
        boolean flag;
        for(int i=1; i<22; i++){
            if(sum[0]!=sum[i]){
                flag=false;
            }
        }
        if(flag){
            System.out.println("Квадрат магический");
        }
        else System.out.println("Квадрат беспонтовый");
    }
}
