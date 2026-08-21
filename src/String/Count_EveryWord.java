package String;
import java.util.Locale;
import java.util.Scanner;

public class Count_EveryWord {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int []freq=new int[256];
        s=s.toLowerCase();
        for(char ch:s.toCharArray()) {
            if (Character.isLetter(ch)) {
                freq[ch]++;
            }
        }
        for(int i=0; i<256; i++){
            if(freq[i]==0) {
                System.out.println((char) i + " " + freq[i]);
            }
        }

    }
}
