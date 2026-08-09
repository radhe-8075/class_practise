package Astra_1;

import java.util.Scanner;

public class Aramstrong {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int orginal=n;
        while(n!=0){
            int ld=n%10;
            sum=sum+(ld*ld*ld);
            n/=10;
        }
        if(sum==orginal)
        System.out.println("Aramstrong : "+sum);
        else System.out.println("Not Aramstrong");
    }
}
