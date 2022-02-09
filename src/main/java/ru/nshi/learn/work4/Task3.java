package ru.nshi.learn.work4;

public class Task3 {

    public static void main(String[] Args){

        Task3 value = new Task3();

        String example = "п1па и лупа п0ш7и  п0л1чать з9рплату";

       int[] numbers = value.numOfTex(example);

        System.out.print('[');
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        System.out.print(']');
    }


    public int[] numOfTex(String str){
        int[] result = new int[str.length()];
        int indArr = 0;

        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                String numb = "";
                numb += str.charAt(i);
                result[indArr] = Integer.parseInt(numb);
                numb = "";
                indArr++;
            }
        }

        int[] cutResult = new int[indArr+1];
        for(int i = 0; i < cutResult.length; i++){
            cutResult[i] = result[i];
        }
        return cutResult;
    }
}
