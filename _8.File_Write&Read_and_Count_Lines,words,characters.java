import java.io.FileInputStream;
import java.io.FileOutputStream;  

public class FileReadWrite {  
    public static void main(String args[]){    
           try{  
             //Writing to the file text.txt after creating it.  
             FileOutputStream fout = new FileOutputStream("text.txt");    
             String s="This file is created to be used by the program;Inorder to count the number of words,lines,characters.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("File Details..."); 
             try {
                //Reading the file text.txt after creating and writing to it.
                FileInputStream fin = new FileInputStream("text.txt");
                int noChar=0,noAlpha=0,i,noLine=0,noWords=0;
                while( (i=fin.read()) != -1 ){
                noChar++;
                if( i>=65 && i<=90 || i>=97 && i<=122){
                   noAlpha++;
                }
                if(i==46){
                   noLine++;
                   noWords++;
                }
                if(i==32 || i==40 || i==44 || i==47 || i==59){
                   noWords++;
                }
                }
                System.out.println("Character Count : "+noChar+"\nAlphabet Count : "+noAlpha+"\nLine Count : "+noLine+"\nWord Count : "+noWords);
             }catch(Exception e) {
              System.out.println("Thrown an exception : "+e);
            }
        }catch(Exception e){System.out.println(e);}    
    }    
}  