package _1d_Array;

import java.util.Scanner;

public class Average_marks {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []marks=new int[n];
        for(int i=0; i<n; i++){
            marks[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0; i<n; i++){
            sum+=marks[i];
        }
        System.out.println("sum " +sum);
        double average=sum/n;
        System.out.println("average"+average+" ");
    }
}
