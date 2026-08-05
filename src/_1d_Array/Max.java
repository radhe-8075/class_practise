package _1d_Array;
import java.util.Scanner;
public class Max {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []marks=new int[n];
        for(int i=0; i<n; i++){
            marks[i]=sc.nextInt();
        }
        int max=marks[0];
        for(int i=0; i<n; i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }

        System.out.println(max);
    }
}
