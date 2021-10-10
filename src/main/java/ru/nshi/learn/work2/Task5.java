package ru.nshi.learn.work2;

public class Task5 {
    public static void main(String[] Args){
    Task1 value=new Task1();
    Task5 value5=new Task5();
    int[] numbers=value.newArray(10);
    numbers=value.randomArray(numbers);
    System.out.print("Исходный массив: ");
    value.printArray(numbers);
    System.out.print("\n"+value5.arfArray(numbers));
 }



 public int arfArray(int[] array){
    Task4 value4=new Task4();
    int imax=value4.imaxArray(array), imin=value4.iminArray(array), max=10, min=100, sum=0;
    if(imax>imin){
        for(int i=imin+1; i<imax; i++){
            sum+=array[i];}
        return sum/(imax-imin-1);
        }
    if(imin>imax){
        for(int i=imax+1; i<imin; i++){
            sum+=array[i];}
        return sum/(imin-imax-1);
        }
    return 0;
}
}
