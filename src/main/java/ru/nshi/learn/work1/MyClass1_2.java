package ru.nshi.learn.work1;

public class MyClass1_2 {
    public static void main(String[] Args){
        MyClass1_2 value=new MyClass1_2();
        int number = 100000, sum=0;
    while(number<1000000){
        if(((number/100000)+(number%100000/10000)+(number%10000/1000))==((number%1000/100)+(number%100/10)+(number%10))){
sum+=number;
        }
    }
    System.out.println(sum);
    }
}
