package Assignment_5;

public class String_rev {
    static void main(String[] args) {
        String str="Radhe Baghel";
        String rev="";
        for(int  i=str.length()-1;i>=0; i--){
            char ch=str.charAt(i);
            rev+=ch;

        }
        System.out.println(rev);
    }
}
