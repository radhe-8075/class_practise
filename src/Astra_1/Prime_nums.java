package Astra_1;

import java.util.Scanner;

public class Prime_nums {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isPrime=true;
        int n=sc.nextInt();
        if(n<=1){
            isPrime=false;
        }
        else{
            for(int i=2; i<n; i++){
                if(n%i==0){
                  isPrime=false;
                  break;
                }
            }
        }
        if(isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
