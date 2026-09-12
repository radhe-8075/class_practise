package String;

import java.util.Locale;
import java.util.Scanner;

public class ULcount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Java12345";
        String f = "JAVa";
        int count=0;
        int chara=0;
        int space=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
            if(Character.isLowerCase(ch)){
                chara++;
            }
             if(Character.isWhitespace(ch)){
                space++;
            }
        }
        System.out.println(count);
        System.out.println(chara);
        System.out.println(space);
    }
}
