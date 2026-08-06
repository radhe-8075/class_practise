package Astra_1;
import java.util.*;
public class Sum_of_Num {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if(n<0){
            n=n*-1;
        }
        while(n!=0){
            int ld=n%10;
            sum=sum+ld;
            n/=10;
        }
        System.out.println(sum);
    }
}
