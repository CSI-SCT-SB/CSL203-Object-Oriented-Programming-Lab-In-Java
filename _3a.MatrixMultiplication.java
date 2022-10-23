import java.io.*;
import java.util.*;

class Matrixmulti
{ 
  public static void main(String[] args)
  {
    int A[][] = new int[10][10];
    int B[][] = new int[10][10];
    int C[][] = new int[10][10];
    int i,j,k,r1,c1,r2,c2;
    Scanner ob= new Scanner(System.in);
    System.out.println(" Enter the no. of rows and columns of 1st matrix ");
    r1 = ob.nextInt();
    c1 = ob.nextInt();
    System.out.println(" Enter the no. of rows and columns of 2nd matrix ");
    r2 = ob.nextInt();
    c2 = ob.nextInt();
    if(c1 == r2){
    System.out.println(" Enter the elements of 1st matrix: ");
    for(i=0; i<r1; i++){
       for(j=0 ; j<c1; j++){
        A[i][j]= ob.nextInt();
        }
      }
    System.out.println(" Enter the elements of 2nd matrix: ");
    for(i=0; i<r2; i++){
       for(j=0 ; j<c2; j++){
        B[i][j]= ob.nextInt();
        }
      }
    System.out.println(" Product of Matrices: ");
    for(i=0; i<r1; i++){
        for(j=0; j<c2 ; j++){
            C[i][j]=0;
            for(k=0 ; k<c1;k++){
            C[i][j] = C[i][j] + A[i][k]*B[k][j];
            }
        System.out.print(C[i][j]+" ");
      }
           System.out.println();

    }

  }
 }
}