package Astra_1;

import java.util.Scanner;

public class Palindrome_Check {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int orginal=n;
        while(n!=0){
            int ld=n%10;
            rev=rev*10+10;
            n/=10;
        }
        if(rev==orginal) System.out.println(rev);
    }
}
