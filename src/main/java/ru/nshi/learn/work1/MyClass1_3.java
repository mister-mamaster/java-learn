package ru.nshi.learn.work1;

import java.util.Scanner;

public class MyClass1_3 {
    public static void main(String[] Args){
        MyClass1_3 value=new MyClass1_3();
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
         if(value.simp(number)) System.out.println("Число является простым");
         else System.out.println("Чило является составным");
    }
public boolean simp(int n){
    for (int deli = 2; deli < n; deli++){
    if (n % deli == 0)
        return false;}
return true;
    }
}
