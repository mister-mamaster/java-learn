package ru.nshi.learn.work3;


public class Task3 {
    public static void main(String[] Args){
    Task1 value1=new Task1();
    Task3 value3=new Task3();
    int[][] matrix=value1.randMrx(10);
    System.out.println("Исходный массив:");
    value1.printMatrix(matrix);
    if(value3.magic(matrix)) System.out.println("Это магический квадрат");
    else System.out.println("Это беспонтовая кучка чисел");
    }


    public boolean magic(int[][] matrix){
        int[] sum=new int[matrix.length*2+2];
        boolean flag=true;
        for(int line=0; line<matrix.length; line++){
            for(int column=0; column<matrix.length; column++){
                sum[line]+=matrix[line][column];
            }
        }
        for(int line=0; line<matrix.length; line++){
            for(int column=0; column<matrix.length; column++){
                sum[matrix.length-1+line]+=matrix[column][line];
            }
        }
        for(int index=0; index<matrix.length; index++){
            sum[matrix.length*2]+=matrix[index][index];
        }
        for(int index=0; index<matrix.length; index++){
            sum[matrix.length*2+1]+=matrix[matrix.length-1-index][index];
        }
        for(int index=1; index<22; index++){
            if(sum[0]!=sum[index]){
                flag=false;
            }
        }
        if(flag){
            return true;
        }
        return false;
    }
}
