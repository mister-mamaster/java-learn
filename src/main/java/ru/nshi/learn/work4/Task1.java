package ru.nshi.learn.work4;

public class Task1 {

    public static void main(String[] Args){


        Task1 value1 = new Task1();
        String str = "Абра-кадабра";
        System.out.println("Str=" + str);
        String[] final_str = value1.cutString(str);
        System.out.println("Итого:");
        for(String i: final_str){
            System.out.println(i);
        }

    }


    public String[] cutString(String str){
        String[] result = new String[str.length()];
        result[0] = "" + str.charAt(0);
        for(int i = 1; i < result.length; i++){
            result[i] = result[i-1] + str.charAt(i);
        }
        return result;
    }

}
