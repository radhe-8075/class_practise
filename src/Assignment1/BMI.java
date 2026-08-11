package Assignment1;
import java.util.*;
public class BMI {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double w=sc.nextDouble();
        float h=sc.nextFloat();
        double bmi=w/(h*h);
        System.out.printf("BMI: %.2f",bmi);
        if(bmi<18.5) System.out.println(" Underweight ");
        else if(bmi<25.0) System.out.println(" Normal weight ");
        else if(bmi<30.0) System.out.println(" Overweight ");
        else System.out.println(" Obese");
        sc.close();
    }
}
