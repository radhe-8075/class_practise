package Astra_1;

import java.util.Scanner;

public class Electricity_Bill {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units : ");
        double units=sc.nextDouble();
        double bill = 0;
        if(units<=100){
            bill=units*5;
        }
        else if(units<=150){
            bill=units*7;

        }
        else if(units<=200) {
            bill = units * 9;
        }
        else{
            System.out.println("limit out");
        }
        System.out.println(bill);
    }
}
