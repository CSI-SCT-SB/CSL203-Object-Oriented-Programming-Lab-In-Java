import java.util.Scanner;

class prime{
  public static void main(String[] args){
    int i, num, n;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter a number to be checked:");
    num = scnr.nextInt();
    n = ((int)Math.sqrt(num)) + 1;
    if (num == 1 || num == 0){
      System.out.println("Number is neither prime nor composite");
      return;
    }
    for (i = 2; i < n; i++){
      if (num % i == 0){
        System.out.println("Number is not prime");
        return;
      }
    }
    System.out.println("Number is prime");
  }
}
