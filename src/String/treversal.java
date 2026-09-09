package String;

import java.util.*;

public class treversal {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();  // sc.next() only for one word ex;input: radhe baghel
        //out:radhe

        for(int i=0; i<s.length(); i++){
           char ch=s.charAt(i);
            System.out.println(ch);
        }
    }
}
