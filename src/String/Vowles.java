package String;

import java.util.Scanner;

public class Vowles {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s="JAV@ is easy";   //"" ,only consonant ho,
        s=s.toLowerCase();
        int v=0;
        for(int i=0; i<s.length(); i++){
          char ch=s.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'  ) v++;
        }
        System.out.println(v);
        sc.close();
    }
}
