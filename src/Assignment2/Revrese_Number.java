package Assignment2;

import java.util.Scanner;

public class Revrese_Number {
    static void main(String[] args) {
        int []arr={1,0,9,5};
        int f=0;
        int l=arr.length-1;
        while(f<l){
            int tem=arr[f];
            arr[f]=arr[l];
            arr[l]=tem;
            f++;
            l--;
        }
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
