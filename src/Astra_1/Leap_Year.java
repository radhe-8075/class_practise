package Astra_1;

import java.util.Scanner;

public class Leap_Year {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("Leap Year");
        }
        else System.out.println("NOT");
    }
}
