package _1d_Array;

import java.util.Scanner;
import java.util.Arrays;

public class Input_User {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []marks=new int[5]; //declartion and intilazation
        for(int i=0; i< marks.length; i++ ){
            marks[i]=sc.nextInt();
        }
       // System.out.println(marks);
        System.out.println(Arrays.toString(marks));
    }
}
