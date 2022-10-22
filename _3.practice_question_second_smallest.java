import java.util.*;
class SecondSmallest{
    public static void main(String args []){
            Scanner in = new Scanner(System.in);
            int n;
            int temp;
            System.out.println("Enter the size :");
            n=in.nextInt();
            int arr [] = new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter the elements:");
                arr[i]=in.nextInt();
            }
            for(int j=0;j<n;j++){
                for(int y=0;y<n-j-1;y++){
                    if(arr[j]>arr[y+1]){
                        temp=arr[y+1];
                        arr[y+1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.println("Second largest :"+arr[arr.length-2]);
    }
}