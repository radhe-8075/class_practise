package _1d_Array;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
     //   int marks[]={50,99,98,60,40};
         int marks[]=new int[n];
         marks[0]=30;
         marks[1]=38;
        marks[2]=20;
        marks[3]=80;
        marks[4]=60;


        System.out.println(Arrays.toString(marks));
        //base adress+2*intrger type byte


    }
}
