package Leet_Code;

public class Peak_Number {
    static void main(String[] args) {
        int []nums={8,9,56,4,8};
        int mi=0;
        int max=nums[0];
        for(int i=0; i<nums.length; i++){
          if(nums[i]>max){
              max=nums[i];
              mi=i;
          }
        }
        System.out.println(mi);
    }
}
