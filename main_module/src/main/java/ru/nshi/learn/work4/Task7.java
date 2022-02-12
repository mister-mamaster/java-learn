package ru.nshi.learn.work4;

public class Task7 {
    public static void main(String[] Args){

        Task7 value7 = new Task7();

        String str = "Четыре чёрненьких чернявеньких чертёнка чертили чёрными чернилами чертёж";
        str = value7.uniSymWord(str);
        if("".equals(str)){
            System.out.print("Уникальных символов нет");
        }
        else System.out.print("Самое длинное слово из уникальных символов:\n" + str);
    }


    public String uniSymWord(String input){
        String[] str = input.split("\\s+");
        int[] count = new int[str.length];
        int iMax = 0;
        for(int nSt = 0; nSt < str.length; nSt++){
            for(int i = 0; i < str[nSt].length(); i++){
                if(str[nSt].indexOf(str[nSt].charAt(i)) == str[nSt].lastIndexOf(str[nSt].charAt(i))){
                    count[nSt]++;
                }
            }
        }
        for(int i = 1; i < count.length; i++){
            if(count[i] > count[iMax]){
                iMax = i;
            }
        }
        return str[iMax];
    }
}
