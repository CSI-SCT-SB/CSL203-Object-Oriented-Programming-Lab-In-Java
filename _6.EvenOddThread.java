class Even extends Thread            //thread to display even numbers
{
    public void run()
    {
        System.out.println("Even Numbers :");
        for(int i=2;i<=100;i+=2)
            System.out.println(i);
    }
}
class Odd extends Thread              //thread to display odd numbers
{
    public void run()
    {
        System.out.println("Odd Numbers :");
        for(int i=1;i<=100;i+=2)
            System.out.println(i);
    }
}


public class Main
{
	public static void main(String[] args) 
	{
		Even ob1 = new Even();
		ob1.run();
		System.out.println();
		Odd ob2 = new Odd();
		ob2.run();
	}
}
