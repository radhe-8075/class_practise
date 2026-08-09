package Astra_1;

import java.util.Scanner;

public class GCD_Number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int rem;
        while(b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("GCD "+a);
    }
}
