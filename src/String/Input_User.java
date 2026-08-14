package String;

import java.util.Arrays;

public interface Input_User {
    static void main(String[] args) {


        String name="Radhe Baghel";
        System.out.println(name);

        String s1= new String("Ram Ram jii");
        System.out.println(s1);

        char ch[]={'a','b','c','d'};  //char se string
        String s2= new String(ch);
        System.out.println(s2);

        char arr[]=s1.toCharArray();  //string se char
        System.out.println(Arrays.toString(arr));

        //for length
        System.out.println(s2.length());  //string ke pass method hota hai jise hum call karte hai
        System.out.println(arr.length); // jbki arr me variable hota hai

        for(int i=0; i<s1.length(); i++){
            System.out.println(s1.charAt(i));

            String s3="Radhe";
            String s4="Radhe";
            if(s3.equals(s4)) System.out.println("same"); // string is a immutable hoti hai mtlb ek bar banane ke bd change nhii hooti hai heap memory me
            else System.out.println("not same");

            String s6="abcdef";
            String rem=s6.substring(1);
            char ch1=s6.charAt(0);
            String  ans=Character.toUpperCase(ch1)+rem;
            System.out.println(ans);
            System.out.println(s6.substring(1,4));

            String s7="  abcd  "; //important
            System.out.println(s7.trim());


            String s8="abcdef";
            System.out.println(s8.replace('a','z'));

            String s9="Hello World";
            String s10="Hello";
            System.out.println(s9.startsWith(s10));
            System.out.println(s9.endsWith(s10));

            System.out.println(s9.contains(s10));

        }
    }
}
