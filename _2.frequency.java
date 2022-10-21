import java.util.*;

class Frequency{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        String a;
        char finder;
        int counter=0;
        System.out.println("Enter the string :");
        a=in.next();
        System.out.println("Enter the character to check :");
        finder=in.next().charAt(0);
        for(int i=0;i<a.length();i++){
            if(finder==a.charAt(i)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}