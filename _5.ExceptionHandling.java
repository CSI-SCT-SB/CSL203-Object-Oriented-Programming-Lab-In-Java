import java.util.Scanner;
//defining an exception class
class InsufficientBalanceError extends Exception{
    //defining constructor
    InsufficientBalanceError(String msg){
        System.out.println(msg);
    }
}
class ExceptionHandling{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to banking service");
        System.out.println("````````");
        System.out.println("Your bank balance is 2000 rupees!");
        System.out.print("Enter the amount you want to withdraw:");
        int amount = sc.nextInt();
        //try block
        try{
            withdraw(amount);
            System.out.println("Amount withdrawn!");
        }
        //if amount exceeds the balance
        catch (Exception e){
            System.out.println(e);
        }
    }
    //withdraw method
    static void withdraw(int amount) throws InsufficientBalanceError{
        if(amount>2000)
        {
            throw new InsufficientBalanceError("No sufficient balance in your account!");
        }
    }
}
