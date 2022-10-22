import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_readWrite
{
	public static void main(String[] args) 
	{
	    try
	    {
            /*creating a new file*/
	        File f1 = new File("test.txt");       
	        if(f1.createNewFile())              
	        {
	            System.out.println("**File Created Successfully**");
	            System.out.println("    Filename : "+f1.getName());
	            System.out.println("    Readable : "+f1.canRead());
	            System.out.println("    Writeable : "+f1.canWrite());
	            
	        }
	        else
	        {
	            System.out.println("An error occurred!");
	        }
	        /*writing to the file using object of FileWriter*/
	        FileWriter writer = new FileWriter("test.txt");  
            writer.write("This is a test file for demonstrating File Handling in Java!");
	        writer.close();
	        
	        System.out.println("-------------------------------------");
	        System.out.println("Successfully wrote to the file..");
	        System.out.println("-------------------------------------");
	        
            /*reading the file using object of scanner class*/
	        Scanner sc = new Scanner(f1);
	        System.out.println("**FILE CONTENT**");
	        System.out.println();
	        int character=0, word=0, line=0;
	        while(sc.hasNextLine())           
	        {
	            //character++; //counts whitespace also
	            line++;
	            word++;
	            String str = sc.nextLine();
	            for(int i=0; i<str.length(); i++)
	            {
	                if(str.charAt(i)==' ')
	                    word++;
	                else
	                    character++;   //doesnt count whitespace
	                
	            }
	            
	        }
	        System.out.println("No. of characters = "+character);
	        System.out.println("No. of words = "+word);
	        System.out.println("No. of lines = "+line);
	        
	        sc.close();
	        
	    }
	    catch(IOException e)
	    {
	        System.out.println(e);
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
		
	}
}
