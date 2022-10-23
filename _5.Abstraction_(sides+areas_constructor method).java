import java.util.Scanner;
import java.lang.Math;

abstract class Shape
{
    abstract void numberOfSides();
    abstract void area();
}

class Rectangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("\nThe number of sides of the Rectangle is 4.");
    }
    void area()
    {
        double a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length : ");
        a = scan.nextDouble();
        System.out.println("Enter the breadth : ");
        b = scan.nextDouble();
        System.out.println("The area of the Rectangle is "+a*b+" square units.\n");
    }
}
class Triangle extends Shape
{
    void numberOfSides()
    {
        System.out.println("\nThe number of sides of the Triangle is 3.");
    }
    void area()
    {
        double a,b,c,s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of side 1 : ");
        a = scan.nextDouble();
        System.out.println("Enter the length of side 2 : ");
        b = scan.nextDouble();
        System.out.println("Enter the length of side 3 : ");
        c = scan.nextDouble();
        s = (a+b+c)/2;
        System.out.println("S : "+s);
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the Triangle is "+area+" square units.\n");
    }
}
class Hexagon extends Shape
{
    void numberOfSides()
    {
        System.out.println("\nThe number of sides of the Hexagon is 6.");
    }
    void area()
    {
        double a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of side of Hexagon : ");
        a = scan.nextDouble();
        double area = (3*Math.sqrt(3)*a*a)/2;
        System.out.println("The area of the Hexagon is "+area+" square units.\n");
    }
}
public class Abstraction
{
	public static void main(String[] args) 
	{
	   Rectangle rec = new Rectangle();
	   Triangle tri = new Triangle();
	   Hexagon hex = new Hexagon();
	   Scanner scan = new Scanner(System.in);
	   char ch;
	   do
	   {
	       System.out.println("\nshapes...\n1.Rectangle\n2.Triangle\n3.Hexagon\nchoose shape : ");
	       int choice = scan.nextInt();
	       switch(choice)
	       {
	           case 1:
	           {
	              rec.numberOfSides();
                  rec.area();
	              break;
	           }
	           case 2:
	           {
	              tri.numberOfSides();
	              tri.area();
	              break;
	           }
	           case 3:
	           {
	              hex.numberOfSides();
	              hex.area();
	              break;
	           }
	           default:
	           {
	               System.out.println("choose correct shape.");
	               break;
	           }
	       }
	       System.out.println("Do you want to continue(Type y for Yes OR n for No) : ");
	       ch = scan.next().charAt(0);
	   }while(ch=='y' || ch=='Y');
	   System.gc();
	}
}

