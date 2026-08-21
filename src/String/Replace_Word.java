package String;

import java.util.Scanner;

public class Replace_Word {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* String s="I LIKE JAVA ";
        s=s.replace("JAVA","Radhe");
        System.out.println(s);*/
       String s=sc.nextLine();
        String ow=sc.nextLine();
        String nw=sc.nextLine();
        String result=s.replace(ow, nw);
        System.out.println(result);
    }
}
