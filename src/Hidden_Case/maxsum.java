package Hidden_Case;

import java.util.Scanner;

public class maxsum {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int []arr={5,2,6,9,7,8,5,3};
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }

        int maxs=sum;
        for(int i=k; i<arr.length; i++){
            sum=sum-arr[i-k]+arr[i];
            maxs=Math.max(maxs,sum);
        }

       System.out.println(maxs);
    }
}
