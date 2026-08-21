package String;
import java.util.*;

public class Frist_UnChar {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int []freq=new int[256];
        s=s.toLowerCase();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch)) {
                freq[ch]++;
            }
        }
        boolean found=false;
        for(char ch:s.toCharArray()){
            if(freq[ch]==1){
                System.out.println(ch);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("not found unique character");
        }
    }
}
