package ru.nshi.learn.work1;

public class Task4{
    public static void main(String[] Args){
        Task4 value = new Task4();
        int sum=0, number=1000;
        while (number<=2000){
         if(value.simp(number)){sum+=number;}
         number++;
        }
        System.out.println(sum);
    }
    public boolean simp(int n){
        for (int deli = 2; deli < n; deli++){
        if (n % deli == 0)
         return false;}
        return true;
        }
}
