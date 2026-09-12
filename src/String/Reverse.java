package String;

import java.util.Scanner;

public class Reverse {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="COMPUTER";
        char f=s.charAt(0);
        char l=s.charAt(s.length()-1);

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));
        System.out.println(0);
        System.out.println(s.length()-1);

        System.out.println(s.indexOf(f));
        System.out.println(s.lastIndexOf(l));


    }
}
