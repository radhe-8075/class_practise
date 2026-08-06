package _1d_Array;

public class Reverse_array {
    static void main(String[] args) {
        int []nums={89,78,56,20};
        int start=0;
        int end=nums.length-1;
        int tem=nums[0];
        while(start<end){
            tem=nums[start];
            nums[start]=nums[end];
            nums[end]=tem;
            start++;
            end--;
        }
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}

