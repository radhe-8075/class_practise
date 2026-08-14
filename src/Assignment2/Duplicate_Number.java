package Assignment2;

import java.util.*;

public class Duplicate_Number {
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 1, 2, 5, 1};

        Arrays.sort(arr);

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
