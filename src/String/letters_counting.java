package String;

import java.util.Scanner;

public class letters_counting {
    static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   // String s=new String("rAdhea age");
        String s=sc.nextLine();
        char target=sc.next().charAt(0);
        int v=0;
    for(int i=0; i<s.length(); i++){

            v++;

    }
    System.out.println(v);
}
}
