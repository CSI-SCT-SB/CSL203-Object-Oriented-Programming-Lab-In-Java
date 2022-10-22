import java.util.*;
public class quicksort
{
    public static void quicksort(String A[],int p,int r)
    {
        if(p<r)
        {
            int q = partition(A,p,r);
            quicksort(A,p,q-1);
            quicksort(A,q+1,r);
        }
    }
    
    public static int partition(String A[],int p,int r)
    {
        String x = A[r];
        int i = p-1;
        for(int j=p;j<r;j++)
        {
            if(A[j].compareTo(x) <= 0)
            {
                i = i+1;
                String temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        String temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        return i+1;
    }
    
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of words : ");
        int n = scan.nextInt();
        scan.nextLine();
        String A[] = new String[n];
        System.out.println("Enter the names : ");
        for(int i=0;i<n;i++)
        {
            A[i] = scan.nextLine();
        }
        quicksort(A,0,n-1);
        System.out.println("\n__After Quick Sort__\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }
    }
}