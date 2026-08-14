package Assignment2;

import java.util.Scanner;

public class Linear_Search {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={56,78,45,23,45};
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==key){
                found=true;
            }
        }
        if(found) System.out.println("Find the number : "+key);
        else System.out.println("not find the number");
    }
}
