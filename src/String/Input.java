package String;

import java.util.Locale;

public class Input {
    static void main(String[] args) {
        String s="Hello";
       // s+=" World";
        String b=" hello ";
        String c="I Love Java";
        String result=c.replace("Java","c");
        System.out.println(s.charAt(4));
        System.out.println(s.length());
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.equals(b));
        System.out.println(s.equalsIgnoreCase(b));
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,4));
        System.out.println(c.contains("java"));
        System.out.println(c.indexOf("java"));
        System.out.println(result);
        System.out.println(b.trim());

        for(int i=0; i<s.length(); i++){
            System.out.print(s.charAt(i)+" ");
        }

    }
}
