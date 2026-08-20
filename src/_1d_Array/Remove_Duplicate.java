package _1d_Array;
import  java.util.*;

public class  Remove_Duplicate {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
        int []nums={0,2,1,3,6,5,4,5,0};
       /* int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        */
        Arrays.sort(nums);
        int j=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        for(int i=0; i<=j; i++){
        System.out.print(nums[i]);
        }
    }
}
