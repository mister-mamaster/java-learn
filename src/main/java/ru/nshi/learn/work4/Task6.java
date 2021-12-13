package ru.nshi.learn.work4;

public class Task6 {
    public static void main(String[] Args){

        Task6 value6 = new Task6();

        String[] str = {"jfnhy789'r4w+-/1ud0827432476c/dhsag6tc7p;aэьомвшхгу04ц", "fdgh6i7u", "8rshysh6rvfdgj4"};
        String finalStr = value6.UniSymArr(str);
        System.out.print("Самая длинная строка из уникальных символов из уникальных символов:\n" + finalStr);
    }

    public String UniSymArr(String[] str){
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
