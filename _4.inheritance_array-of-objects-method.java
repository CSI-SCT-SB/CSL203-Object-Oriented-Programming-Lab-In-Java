import java.util.Scanner;

class Employee
{
    String Name,Phonenumber,Address;
    int Age,Basicpay,HouseRentAllowance,TravelAllowance,Bonus,PensionFund,Insurance,IncomeTax;
    int deduction,addition,totalsalary,netsalary;
    
    Scanner sc = new Scanner(System.in);
    
    Employee()
    {
        System.out.print("\nName : ");
        this.Name = sc.nextLine();
        System.out.print("\nAge : ");
        this.Age = sc.nextInt();
        sc.nextLine();
        System.out.print("\nPhone number : ");
        this.Phonenumber = sc.nextLine();
        /*System.out.print("\nBasic pay : ");
        this.Basicpay = sc.nextInt();*/
        System.out.print("\nAddress : ");
        this.Address = sc.nextLine();
    }
    void calculate_salary()
    {
        HouseRentAllowance = Basicpay * 5/100;
        TravelAllowance = Basicpay * 3/100;
        Bonus  =  Basicpay * 2/100;
        PensionFund = Basicpay * 10/100;
        Insurance = Basicpay * 3/100; //Insurance amount is user choice.Here considered as 3% of Basic pay.
        IncomeTax = Basicpay * 5/100;
        deduction = PensionFund+IncomeTax+Insurance;
        addition = HouseRentAllowance+TravelAllowance+Bonus;
        totalsalary = Basicpay+addition;
        netsalary = totalsalary-deduction;
    }
    
    void print_salary()
    {
        System.out.println("\nSalary details of "+Name+"\n");
        System.out.println("Basic pay : "+Basicpay);
        System.out.println("House Rent Allowance : "+HouseRentAllowance);
        System.out.println("Travel Allowance : "+TravelAllowance);
        System.out.println("Bonus : "+Bonus);
        System.out.println("Pension Fund : "+PensionFund);
        System.out.println("Insurance : "+Insurance);
        System.out.println("Income Tax : "+IncomeTax);
        System.out.println("Salary Addition: "+addition);
        System.out.println("Salary Deduction: "+deduction);
        System.out.println("Total Salary: "+totalsalary);
        System.out.println("Net Salary: "+netsalary);
    }
    
    void display()
    {
        System.out.println("Name : "+this.Name);
        System.out.println("Age : "+this.Age);
        System.out.println("Phone number : "+this.Phonenumber);
        System.out.println("Address : "+this.Address);
    }
}

class Officer extends Employee
{
    String Specialization;
    Officer()
    {
        super();
        System.out.print("\nBasic pay : ");
        Basicpay = sc.nextInt();
        sc.nextLine();
        System.out.print("\nSpecialization : ");
        Specialization = sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Specialization : "+this.Specialization);
        super.calculate_salary();
    }
}

class Manager extends Employee
{
    String Department;
    Manager()
    {
        super();
        System.out.print("\nBasic pay : ");
        Basicpay = sc.nextInt();
        sc.nextLine();
        System.out.print("\nDepartment : ");
        Department = sc.nextLine();
    }
    void display()
    {
        super.display();
        System.out.println("Department : "+this.Department);
        super.calculate_salary();
    }
}

public class inheritance
{
    public static void main(String args[])
    {
        int i,n,m;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of Officers : ");
        n = sc.nextInt();
        Officer []officers = new Officer[n];
        System.out.println("\n  Enter Details of officers...");
        for(i=0;i<n;i++)
        {
            System.out.println("\nDetails of officer "+(i+1));
            Officer temp = new Officer();
            officers[i] = temp;
        }
        
        System.out.println("\nEnter the number of Managers : ");
        m = sc.nextInt();
        Manager []managers = new Manager[m];
        System.out.println("\n  Enter Details of managers...");
        for(i=0;i<m;i++)
        {
            System.out.println("\nDetails of manager "+(i+1));
            Manager temp = new Manager();
            managers[i] = temp;
        }
        
        System.out.println("\n\tEmployee Profile...");
        System.out.println("\n  Officer Details...\n");
        for(i=0;i<n;i++)
        {
            System.out.println("\nOfficer "+(i+1));
            officers[i].display();
            officers[i].print_salary();
        }
        System.out.println("\n  Manager Details...\n");
        for(i=0;i<m;i++)
        {
            System.out.println("\nManager "+(i+1));
            managers[i].display();
            managers[i].print_salary();
        }
    }
}