import java.util.*;

class Palindrome{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        String a;
        int f=1;
        System.out.println("Enter the string :");
        a=in.next();
        for(int i=0;i<a.length();i++){
        
            if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                System.out.println("Not palindrome !");
                f=0;
                break;
            }
        }
        if(f==1){
            System.out.println("Palindrome");
        }

    }
}