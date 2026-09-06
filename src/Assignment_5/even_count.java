package Assignment_5;

public class even_count {
    static void main(String[] args) {
        int []arr={2,8,6,9,0,7};
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
