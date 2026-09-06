package Assignment_5;
import java.util.*;

public class letter_count {
    static void main(String[] args) {
        String sc = "hello12345678";
        int letter = 0;
        int even=0;
        int odd=0;
        for (int i = 0; i < sc.length(); i++) {
            char ch = sc.charAt(i);
            if(Character.isLetter(ch)){
                letter++;
            }
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println(letter);
        System.out.println(even);
        System.out.println(odd);
    }
}
