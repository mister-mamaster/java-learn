package ru.nshi.learn.work4;

public class Task4{

    public static void main(String[] Args){

        Task4 value = new Task4();

        String example = "usdy45dofi  Iu9  0 123\n";
        System.out.print(value.sumOfTex(example));

    }


    public int sumOfTex(String str){
        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                String numb = "";
                numb += str.charAt(i);
                sum += Integer.parseInt(numb);
                numb = "";
            }
        }
        return sum;
    }

}
