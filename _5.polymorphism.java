import java.util.*;
abstract class Shape{
    public abstract void numberofSides();
}

class Triangle extends Shape{
    public void numberofSides(){
        System.out.println("Number of sides of rectangle is :3");
    }
}
class Rectangle extends Shape{
    public void numberofSides(){
        System.out.println("Number of sides of rectangle is :4");
    }
}
class Hexagon extends Shape{
    public void numberofSides(){
        System.out.println("Number of sides of rectangle is :6");
    }
}
class Main{
    public static void main(String args []){
        Triangle t =new Triangle();
        Rectangle r = new Rectangle();
        Hexagon h = new Hexagon();
        t.numberofSides();
        r.numberofSides();
        h.numberofSides();
    }
}