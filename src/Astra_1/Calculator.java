package Astra_1;

import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the operator");
        char op=sc.next().charAt(0);
        switch (op){
            case '+':
                System.out.println(a+b); break;
            case'-':
                System.out.println(a-b); break;
            case'*':
                System.out.println(a*b); break;
            case'/':
                if(b!=0)System.out.println(a/b);
                else System.out.println("not divided");
                break;

            default:
                System.out.println("invaild operator");

        }

    }
}
