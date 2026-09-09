package String;


import java.util.Scanner;

public class occurance {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int f=s.indexOf('a');
        int l=s.lastIndexOf('a');
        System.out.println(f);
        System.out.println(l);
    }
}
