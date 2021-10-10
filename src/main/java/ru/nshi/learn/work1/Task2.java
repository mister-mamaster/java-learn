package ru.nshi.learn.work1;

public class Task2{
    public static void main(String[] Args){
    Task1 value = new Task1();
    int number = 100000, sum=0;
    while(number<1000000){
     if(value.lucynumber(number)){

      sum+=number;}
      number++;
   }
    System.out.println(sum);
  }
}
