package ru.nshi.learn.work3;

public class Task4{
    public static void main(String[] Args){
        Task1 value1=new Task1();
        Task4 value4=new Task4();
        int[][] matrix=value1.randMrx(10);
        System.out.println("Исходный массив:");
        value1.printMatrix(matrix);
        matrix=value4.Sort(matrix);
        System.out.println("Отсортированный массив:");
        value1.printMatrix(matrix);
    }


    public int[][] Sort(int[][] matrix) {
        boolean sort=true;
        for(int line1=0; line1<10; line1++){
            for(int column1=0; column1<10; column1++){
                sort=true;
                while(sort){
                    for(int line2=0; line2<10; line2++){
                        for(int column2=0; column2<10; column2++){
                            if(matrix[line2][column2]>matrix[line1][column1]){
                                sort=false;
                                int buff = matrix[line1][column1];
                                matrix[line1][column1] = matrix[line2][column2];
                                matrix[line2][column2] = buff;

                            }
                        }
                    }
                }
            }
        }
        return matrix;
    }
}
