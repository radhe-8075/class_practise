package String;

import java.util.Scanner;

public class Vowels_Count {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String("radhe");
        int v=0;
        for(int i=0; i<s.length(); i++){
            char ch =s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                v++;
        }
        System.out.println();
    }
}