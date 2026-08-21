package String;

import java.util.Scanner;

public class Reverse {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="   ";
       // String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;  i>=0;  i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
}
