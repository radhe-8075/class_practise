package Assignment1;

import java.util.Scanner;

public class Input_Output {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rl=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        double marks=sc.nextDouble();
        sc.nextLine();
        String city=sc.nextLine();
        System.out.println("Roll Number: "+rl);
        System.out.println("Full Name: "+name);
        System.out.printf("Marks:%.2f%n ",marks);
       // System.out.println("marks: "+marks);
        System.out.println("City: "+city);

    }
}
