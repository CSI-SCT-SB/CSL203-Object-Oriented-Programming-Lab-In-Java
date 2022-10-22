import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    int choice=1,flag=0;
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements :");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter the array elements(sorted):");
		for(int i=0; i<size; i++)
		    arr[i]=sc.nextInt();
		do{
		System.out.print("Enter the element to be searched : ");
		int key = sc.nextInt();
		int beg=0, end=size-1;
		for(int i=0; i<size; i++)
		{   
		    int mid = (beg+end)/2;
		    if(arr[mid]==key)
		    {
		        flag=1;
		        System.out.println("Element Found at position :"+(mid+1));
		        break;
		    }
		    else if(key>arr[mid])
		        beg = mid+1;
		   
		    else
		        end = mid-1;
		}
		if(flag==0)
		    System.out.println("Element Not Found !");
        System.out.println("*************************************************");
		System.out.println("Want to search for another element?  (1.Yes/2.No)");
		choice = sc.nextInt();
	    }while(choice==1);
	}
}
