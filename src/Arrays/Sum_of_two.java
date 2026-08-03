package Arrays;

import java.util.Scanner;

public class Sum_of_two {
    static void main(String[] args) {
        //Scanner sc= new Scanner(System.in);
        int []nums={1,2,3,4,5};
        int target=12;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                for(int k=j+1; k< nums.length; k++) {
                    if (nums[i] + nums[j]+nums[k] == target) {
                        System.out.println("Answer:[" + i + " " + j +" "+ k + "]");
                    }
                }
            }
        }
    }
}
