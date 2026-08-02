package Assignment1;
import java.util.Scanner;
public class Even_Odd {;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       /* if(n%2==0 && n>0  ){
            System.out.println("Even Number");
        }
        else if(n>=0){
            System.out.println("Not s even number and odd number");
        }
        else{
            System.out.println("Odd Number");
        } */
        // second approch
        if((n&1)==0) System.out.println("Even");
        else System.out.println("odd");
        sc.close();


    }
}
