package Assignment1;
import java.util.Scanner;

public class Count_Number {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        Math.abs(n);
        int count=0;
        if(n==0){
            count=1;
        }
        else{
            while(n!=0){
                int ld=n%10;
                count++;
                n/=10;
            }
        }
        System.out.print(count);

    }
}
