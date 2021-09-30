package ru.nshi.learn.work1;

public class Task2{
    public static void main(String[] Args){
    Task2 value = new Task2();
    int number = 100000, sum=0;
    while(number<1000000){
     if(value.lucynumber(number)){

      sum+=number;}
      number++;
   }
    System.out.println(sum);
  }

    public boolean lucynumber(int sixnumber){
        return ((sixnumber/100000)+(sixnumber%100000/10000)+(sixnumber%10000/1000))==((sixnumber%1000/100)+(sixnumber%100/10)+(sixnumber%10));
 }
}
