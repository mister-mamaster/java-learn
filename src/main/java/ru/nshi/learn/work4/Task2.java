package ru.nshi.learn.work4;

public class Task2 {

    public static void main(String[] Args){

        Task2 value = new Task2();

        String example = "БутеРБрод С  КолБасоЙ";
        example = value.capit(example);
        System.out.print(example);

    }


    public String capit(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }

}
