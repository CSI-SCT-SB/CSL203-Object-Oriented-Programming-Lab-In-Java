import java.util.*;
public class StringTokenizer
{
   public static void main(String args[]) 
   {
      int dig=0,sum=0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a sequence of integers with space between them : ");
      String digit = scan.nextLine();
      StringTokenizer token = new StringTokenizer(digit);
      System.out.println("The integers in the sequence are : ");
      while(token.hasMoreTokens())
      {
          String s = token.nextToken();
          dig = Integer.parseInt(s);
          System.out.println(dig+" ");
          sum = sum + dig;
      }
      System.out.println();
      System.out.println("Sum of the integers : "+sum);
   }
}
