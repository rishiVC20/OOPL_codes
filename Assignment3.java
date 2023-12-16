//Rishikesh Chaudhari
//E11 23304

/*Inheritance
Design and develop inheritance for a given case study, identify objects and relationships and implement inheritance wherever applicable. Employee class has Emp_name, Emp_id, Address, Mail_id, and Mobile_no as members. Inherit the classes: Programmer, Team Lead, Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary. */

package OOPL_codes;

import java.util.Scanner;

class Employee
{
    Scanner sc = new Scanner(System.in);
    private String Emp_name,Emp_id,address,mail_id;
    protected String position;
    private long mobile_no;
    private double basicPay,DA,HRA,PF,staff_club_fund,gross_salary,net_salary;

    Employee(String type)
    {
        System.out.println();
        System.out.println("Enter the details of  " + type);
        System.out.println("---------------------------------");
        System.out.print("Enter the name of " + type + " ");
        Emp_name = sc.next();
        System.out.print("Enter the employee ID of " + type + " ");
        Emp_id = sc.next();
        System.out.print("Enter the address of " + type + " ");
        address = sc.next();
        System.out.print("Enter the mail ID of " + type + " ");
        mail_id = sc.next();
        System.out.print("Enter the mobile number of " + type + " ");
        mobile_no = sc.nextLong();
        System.out.print("Enter the salary of " + type + " ");
        basicPay = sc.nextDouble();
    }

    public void calculateSalary()
    {
        DA = 0.97*basicPay;
        HRA = 0.1*basicPay;
        PF = 0.12*basicPay;
        staff_club_fund = 0.001*basicPay;
        gross_salary = basicPay+DA+HRA+PF+staff_club_fund;
        net_salary = gross_salary-(PF+staff_club_fund);
    }

    public void generatePayslip()
    {
        System.out.println();
        System.out.println("-------Employee Pay Slip-------");
        System.out.println("-----------------------------------");
        System.out.println("Employee Name                : " + Emp_name);
        System.out.println("Employee ID                  : " + Emp_id);
        System.out.println("Employee address             : " + address);
        System.out.println("Employee mail ID             : " + mail_id);
        System.out.println("Employee mobile number       : " + mobile_no);
        System.out.println("Employee Position            : " + position);
        System.out.println("Direct Allowance (DA)        : " + DA );
        System.out.println("Home Rental Allowance(HRA)   : " + HRA);
        System.out.println("Provident Fund (PF)          : " + PF);
        System.out.println("Stff Club Fund               : " + staff_club_fund);
        System.out.println("Gross Salary                 : " + gross_salary);
        System.out.println("Net Salary                   : " + net_salary);
    }
}

class Programmer extends Employee
{
    Programmer(String pos)
    {
        super(pos);
        position = pos;
    }
}

class TeamLead extends Employee
{
    TeamLead(String pos)
    {
        super(pos);
        position = pos;
    }
}


class AssProject_Manager extends Employee
{
    AssProject_Manager(String pos)
    {
        super(pos);
        position = pos;
    }
}

class Project_Manager extends Employee
{
    Project_Manager(String pos)
    {
        super(pos);
        position = pos;
    }
}

public class Assignment3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do
        {
            System.out.println();
            System.out.println("Welcome to Employee PaySlip Program");
            System.out.println("1. Programmer\n2. Team Lead\n3. Assistant Project Manager\n4. Project Manager\n0. Exit");
            System.out.println();
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1: Programmer p1 = new Programmer("Programmer");
                        p1.calculateSalary();
                        p1.generatePayslip();
                        break;
            
                case 2: TeamLead l = new TeamLead("TeamLead");
                        l.calculateSalary();;
                        l.generatePayslip();
                        break;
                        
                case 3: AssProject_Manager p2 = new AssProject_Manager("Assistant Project MAnager");
                        p2.calculateSalary();;
                        p2.generatePayslip();
                        break;
                        
                case 4: Project_Manager p3 = new Project_Manager("Project Manager");
                        p3.calculateSalary();;
                        p3.generatePayslip();
                        break;
                        
                case 0: System.out.println("Program Terminated Successfully");
                        System.exit(1);

                default: System.out.println("Enter correct choice !!");
                         System.out.println();
            }
        }
        while (choice != 0);
    }    
}
