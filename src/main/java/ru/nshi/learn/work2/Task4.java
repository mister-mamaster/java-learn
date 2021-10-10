package ru.nshi.learn.work2;


public class Task4 {
    public static void main(String[] Args){
    Task1 value=new Task1();
    Task4 value4=new Task4();
    int[] numbers=value.newArray(10);
    numbers=value.randomArray(numbers);
    System.out.print("Исходный массив: ");
    value.printArray(numbers);
    int imax=value4.imaxArray(numbers), imin=value4.iminArray(numbers);
    numbers[imax]+=numbers[imin];
    numbers[imin]=numbers[imax]-numbers[imin];
    numbers[imax]-=numbers[imin];
    System.out.print("\nИтоговый массив: ");
    value.printArray(numbers);
    }



    public int imaxArray(int[] array){
        Task3 value3= new Task3();
        int max=value3.maxArray(array);
        for(int i=0; i<array.length; i++){
            if(array[i]==max){
                return i;
            }
        }
        return 0;
}


public int iminArray(int[] array){
    Task3 value3= new Task3();
    int min=value3.minArray(array);
    for(int i=0; i<array.length; i++){
        if(array[i]==min){
            return i;
        }
    }
    return 0;
}
}
