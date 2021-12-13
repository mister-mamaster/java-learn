package ru.nshi.learn.work4;

public class Task5 {
    public static void main(String[] Args){

        Task5 value5 = new Task5();

        String str = "jfnhy789'r4w+-/1ud0827432476c/dhsag6tc7p;aэьомвшхгу04ц";
        str = value5.UniSym(str);
        if("".equals(str)){
            System.out.print("Уникальных символов нет");
        }
        else System.out.print("Строка из уникальных символов:\n" + str);
    }


    public String UniSym(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }
}
