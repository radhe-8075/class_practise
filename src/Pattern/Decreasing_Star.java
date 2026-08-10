package Pattern;

import java.util.Scanner;

public class Decreasing_Star {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
