package Astra_1;
import java.util.*;
public class reverse_1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        System.out.println("Reverse Number : "+rev);
    }
}
