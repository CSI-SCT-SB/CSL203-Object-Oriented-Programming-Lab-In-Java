import java.util.Scanner;
interface officer_int
{
    //by default the visibility of the methods in interface in java is public void
    void printSalary();
    void printdetails();
}
interface Manager extends officer_int{

}

public class InterfaceInheritance{
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        officer o1 = new officer();
        manager m1 = new manager();
        //officer section
        System.out.println("Enter the name of the officer:");
        o1.name=sc.nextLine();
        System.out.println("Enter the age of the officer:");
        o1.age=sc.nextInt();
        System.out.println("Enter the phhone number of the officer:");
        o1.phn_number=sc.nextLong();
        String c = sc.nextLine();
        System.out.println("Enter the address of the officer:");
        o1.address=sc.nextLine();
        System.out.println("Enter the salary of the officer:");
        o1.salary=sc.nextFloat();
        c = sc.nextLine();
        System.out.println("Enter the specialisation of the officer:");
        o1.specialisation=sc.nextLine();
        //manager section
        System.out.println("Enter the name of the manager:");
        m1.name=sc.nextLine();
        System.out.println("Enter the age of the manager:");
        m1.age=sc.nextInt();
        System.out.println("Enter the phhone number of the manager:");
        m1.phn_number=sc.nextLong();
        c = sc.nextLine();
        System.out.println("Enter the address of the manager:");
        m1.address=sc.nextLine();
        System.out.println("Enter the salary of the manager:");
        m1.salary=sc.nextFloat();
        c = sc.nextLine();
        System.out.println("Enter the department of the manager:");
        m1.department=sc.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.println("OFFICER DETAILS:");
        o1.printSalary();
        o1.printdetails();
        System.out.println();
        System.out.println();
        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.println("MANAGER DETAILS:");
        m1.printSalary();
        m1.printdetails();
        System.out.println("//////////////////////////////////END//////////////////////////////////");
    }
}


class officer implements officer_int{
    String name;
    int age;
    long phn_number;
    String address;
    float salary;
    String specialisation;
    //String department;
    public void printSalary(){
        System.out.println("Salary: "+salary);
    }
    public void printdetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Ph No: "+phn_number);
        System.out.println("Address: "+address);
        System.out.println("Department: "+specialisation);
    }
}

class manager implements Manager{
    //String specialisation;
    String name;
    int age;
    long phn_number;
    String address;
    float salary;
    String department;
    public void printSalary(){
        System.out.println("Salary: "+salary);
    }
    public void printdetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Ph No: "+phn_number);
        System.out.println("Address: "+address);
        System.out.println("Department: "+department);
    }
}
