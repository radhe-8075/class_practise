package String;

import java.util.Scanner;

public class ignorecaase {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="java";
        String f="JAVa";
        System.out.println(s.equals(f));
        System.out.println(s.equalsIgnoreCase(f));
    }
}
