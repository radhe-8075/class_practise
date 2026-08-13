package _1d_Array;

import java.util.Scanner;

public class Find_index {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the Array : ");
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]==index){
                System.out.println("index is found "+i);
            }
        }
    }
}
