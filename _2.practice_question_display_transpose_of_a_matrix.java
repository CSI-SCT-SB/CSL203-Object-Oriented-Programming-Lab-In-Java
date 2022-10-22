import java.util.*;
class Transpose{
    public static void main(String args []){
        Scanner in = new Scanner(System.in);
        int row;
        int col;
        System.out.println("Enter the row  and column:");
        row = in.nextInt();
        col= in.nextInt();
        int mat[][] = new int[row][col];
        int transpose[][] = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter the element:");
                mat[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                transpose[i][j]=mat[j][i];
            }
        }
        System.out.println("Matrix you entered");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("--transpose--");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }
}