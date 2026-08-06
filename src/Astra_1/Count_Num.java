package Astra_1;

import java.util.Scanner;

public class Count_Num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
       while(n!=0){
            int ld=n%10;
            n/=10;
            count++;

        }
        /*for (int i = 0; i <= n; i++) {
                int ld = n % 10;
                n /= 10;
                count++;
            }*/  //for loop i se compare karta hai i=0,1,2,3 toh inse cota koi number aay toh fail maar jayega vo
            System.out.println(count);
        }
    }

