package _1d_Array;

import java.util.Scanner;

public class P_N {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int p=0;
        int neg=0;
        for(int i=0; i<n; i++){
            if(arr[i]<=0) p++;
            else neg++;
        }
        System.out.println(p+" "+neg);
    }
}
