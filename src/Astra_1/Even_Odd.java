package Astra_1;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[]args){
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
       // if(n%2==0) System.out.println("Even Number");
       // else System.out.println("Odd");
        if((n&1)==0) System.out.println("Even");
        else System.out.println("odd");
    }
}
