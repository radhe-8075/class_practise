package String;
import java.util.*;
public class findchar {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       char ch=sc.next().charAt(0);
       int index=s.indexOf(ch);
        System.out.println(index);
     //  String f=sc.nextLine();
      //  System.out.println(s.contains(f));
    }
}
