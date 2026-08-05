package _1d_Array;

import java.util.Scanner;

public class Found_Number {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean taregt=false;
        int []marks={30,78,25,89,78};
       int target=sc.nextInt();
       for(int i=0; i<marks.length; i++){
           if(target==marks[i]){
          taregt=true;
               break;
           }
       }
        if(taregt) System.out.println("found");
        else System.out.println("not found");

    }
}
