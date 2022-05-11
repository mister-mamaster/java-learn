package ru.nshi.learn.work1;

import java.util.Scanner;


public class Task1{
    public static void main(String[] Args){
    Task1 value = new Task1();
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    if(!value.lucynumber(number))System.out.println("Это обычное число");  else {
        System.out.println("Это счастливое число");
        }
    }
public boolean lucynumber(int sixnumber){
        return ((sixnumber/100000)+(sixnumber%100000/10000)+(sixnumber%10000/1000))==((sixnumber%1000/100)+(sixnumber%100/10)+(sixnumber%10));
}
}
