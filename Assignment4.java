package OOPL_codes;

import java.util.Scanner;
abstract class Shape
{
    double length,breadth;
    Shape()
    {

    }
    Shape(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    abstract public void compute_area();
}

class rectangle extends Shape
{   
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void compute_area()
    {
        System.out.print("Enter length of a rectangle : ");
        length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle : ");
        breadth = sc.nextDouble();
        System.out.println("Area of  rectangle is : " + length*breadth);
    }
}

class triangle extends Shape
{
    Scanner sc = new Scanner(System.in);
    @Override
    public void compute_area()
    {
        System.out.print("Enter height of a triangle : ");
        length = sc.nextDouble();
        System.out.print("Enter base of a rectangle : ");
        breadth = sc.nextDouble();
        System.out.println("Area of triangle is : " + 0.5*length*breadth);
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Shape s1;
        do
        {
        System.out.println("\nWelcome to program of Dynamic Binding\n1. For Rectangle\n2. For Triangle\n0. For exit");
        choice = sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                System.out.println("Area of rectangle ");
                s1= new rectangle();
                s1.compute_area();
                break;
            }
            case 2:
            {
                System.out.println("Area of triangle");
                s1= new triangle();
                s1.compute_area();
                break;
            }
            case 0:
            {
                System.out.println("Program terminated successfully!!");
                System.exit(1);
            }
            default:
            {
                System.out.println("Enter valid choice");
            }
        }
        
    }   
    while (choice != 0); 
    }
    
}
