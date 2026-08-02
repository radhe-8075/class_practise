package Assignment1;
import java.util.Scanner;
public class Reverse_Number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int orginal=n;
        while(n!=0){
            int ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        if(orginal<=0){
            rev=-rev;
            // for neg to positive.
        }
        System.out.println(rev);
        sc.close();
    }
}
