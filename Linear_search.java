/*
Program Name : Implementation of linear search.
Author Name  : Aryan Sajan Kulathinal
Branch : R3A , Roll.No: 218
*/

import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args){
        int n,i,x,flag=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter the number of elements in the array : ");
        n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the required array : ");
        for(i=0;i<n;i++){
            System.out.println("Enter element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be found : ");
        x=sc.nextInt();
        sc.close();
        for(i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("\nThe number is found at index "+i+" of the array.");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("\nThe number is not found.");
        }

    }
    
}
