package String;

import java.util.Scanner;

public class compareto {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="java";
        String f="JAVa";
        int result =s.compareTo(f);
        if (result < 0) {
            System.out.println("First comes first");
        }
        else if (result > 0) {
            System.out.println("Second comes first");
        }
        else {
            System.out.println("Both are equal");
        }

    }
}
