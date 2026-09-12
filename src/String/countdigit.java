package String;

import java.util.Scanner;

public class countdigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Java12345";
        String f = "JAVa";
        int count=0;
        int chara=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
            if(Character.isLetter(ch)){
                chara++;
            }
        }
        System.out.println(count);
        System.out.println(chara);
    }
}
