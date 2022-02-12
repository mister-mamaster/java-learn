package ru.nshi.learn.work4;

public class Task6 {
    public static void main(String[] Args){

        Task6 value6 = new Task6();

        String[] str = {"f84h4d54v68786sdfew785y7d987", "hgjrsig+98wsa", "qwertyuiopkjhgfdsal"};
        String finalStr = value6.uniSymArr(str);
        System.out.print("Самая длинная строка из уникальных символов из уникальных символов:\n" + finalStr);
    }

    public String uniSymArr(String[] str){
        String[] result = new String[str.length];
        int iMax = 0;
        for(int nSt = 0; nSt < str.length; nSt++){
            result[nSt] = "";
            for(int i = 0; i < str[nSt].length(); i++){
                if(str[nSt].indexOf(str[nSt].charAt(i)) == str[nSt].lastIndexOf(str[nSt].charAt(i))){
                    result[nSt] += str[nSt].charAt(i);
                }
            }
        }
        for(int i = 1; i < str.length; i++){
            if(result[i].length() > result[iMax].length()){
                iMax = i;
            }
        }
             return result[iMax];
    }
}
