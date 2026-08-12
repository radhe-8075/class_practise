package _1d_Array;

import java.util.Scanner;

public class Print_Array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
