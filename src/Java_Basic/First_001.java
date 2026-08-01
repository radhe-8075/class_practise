package Java_Basic;

import java.sql.SQLOutput;

class student{
    String name;
    int rollnumber;
    int age;
}
public class First_001 {
    private static Object s2;

    static void main(String[] args) {
        student s1= new student();
        s1.name="Neeraj";
        s1.rollnumber=12345;
        s1.age=26;
        System.out.println("Name :" + s1.name);
        System.out.println("Roll Number :"+s1.rollnumber);
        System.out.println("Age :" + s1.age);


        student s2=new student();
        s2.name="dheeraj";
        s2.rollnumber=22;
        s2.age=45;
        System.out.println("Name :" + s2.name);
        System.out.println("Roll Number :"+s2.rollnumber);
        System.out.println("Age :" + s2.age);



    }
}

