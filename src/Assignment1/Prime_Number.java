package Assignment1;

import java.util.Scanner;

public class Prime_Number{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime=true;
        if (n <= 1) {
            isPrime=false;  //0 or 1 is not a prime number
        }
        else {
            for (int i = 2; i * i <= n; i++) {
                if(n%i==0){
                    isPrime=false;
                }
            }
        }
        System.out.println(isPrime);
        sc.close();
    }
}
