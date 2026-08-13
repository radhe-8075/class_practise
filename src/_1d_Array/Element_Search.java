package _1d_Array;

import java.util.Scanner;

public class Element_Search {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean isElement=false;
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]==x) {
                isElement=true;
                break;
            }

        }

        if(isElement) System.out.println("True");
        else System.out.println("False");

    }
}
