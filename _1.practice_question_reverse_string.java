import java.util.*;
class Reverse{
    public static void main(String args []){
        Scanner in =  new Scanner(System.in);
        String a ;
        String rev="";
        System.out.println("Enter the string :");
        a=in.next();
        for(int i=0;i<a.length();i++){
            rev+=a.charAt(a.length()-i-1);
        }
        System.out.println("Reversed string :"+rev);
    }
}