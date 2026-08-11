package Assignment1;

import java.util.Scanner;

public class Sum_of_digit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int sum=0;
        while(n!=0){
            long ld=n%10;
            sum+=ld;
            n/=10;
        }
        System.out.println(sum);
    }
}
