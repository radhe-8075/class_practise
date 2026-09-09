package Assignment_5;
import java.util.*;
public class Reverse {
    public static void main(String[]args){
        int []arr={6,8,9,78,2,0,3};
        int l=2;
        int r=5;
        // Arrays.sort(arr);
        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
