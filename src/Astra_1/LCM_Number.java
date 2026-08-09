package Astra_1;

import java.util.Scanner;

public class LCM_Number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int rem;
        int num1=a;
        int num2=b;
        while(b!=0){
            rem=a%b;
            a=b;
            b=rem;
        }
       int lcm=(num1*num2)/a;
        System.out.println("LCM: "+lcm);
    }
}
