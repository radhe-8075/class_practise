package Assignment1;

import java.util.Scanner;

public class Light_bill {
    static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double u=s.nextDouble();
        if(u<=100){
            u*=1.5;
        }
        else if(u<=200 ){
            u=100*1.5+(u-100)*2.5;
        } else if (u<=300 ) {
            u=100*1.5+100*2.5+(u-200)*4.0;
        }
        else{
            u=100*1.5+100*2.5+100*4.0+(u-300)*6;
        }
        System.out.printf("%.2f",u);
        //yha 2f,3f,4f kuch bhi use kar sakte hai jitne piche decimal chaiye us hisab se
    }
}
