class MyThread extends Thread            
{
    public void run()
    {
        System.out.println("***Priority of threads being checked***");
    }
}

public class Main
{
	public static void main(String[] args) 
	{
		MyThread t1 = new MyThread();
		t1.run();
	    System.out.println("t1 Priority :"+t1.getPriority());        //displaying predefined priorities
		MyThread t2 = new MyThread();
		System.out.println("t2 Priority :"+t2.getPriority());
		MyThread t3 = new MyThread();
		System.out.println("t3 Priority :"+t3.getPriority());
		System.out.println();
		t1.setPriority(3);             //assigning priorities by changing predefined priorities
		t2.setPriority(5);
		t3.setPriority(7);
		System.out.println("t1 Priority :"+t1.getPriority());
		System.out.println("t2 Priority :"+t2.getPriority());
		System.out.println("t3 Priority :"+t3.getPriority());
		
	   
	}
}
