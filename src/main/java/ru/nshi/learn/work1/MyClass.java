package ru.nshi.learn.work1;

import java.util.Scanner;


public class MyClass{
    public boolean lucynumber;
    public static void main(String[] Args){
        MyClass valua = new MyClass();
if(valua.lucynumber){
    System.out.println("Это счастливое число");
} else System.out.println("Это обычное число");
    }
public int  lucynumber(){
    Scanner input = new Scanner(System.in);
        int sixnumber = input.nextInt();
    if(((sixnumber/100000)+(sixnumber%100000/10000)+(sixnumber%10000/1000))==((sixnumber%1000/100)+(sixnumber%100/10)+(sixnumber%10))){
        return 1;
    } else return 0;
}
}
